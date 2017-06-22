package org.eclipse.che.examples;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetingController implements Controller
{

   @Override
   public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
   {
      String usuario = request.getParameter("usuario");
      String password = request.getParameter("password");
      
      String resultado = "";
      if (usuario!=null || password!=null)
      {
        resultado = "Hola, " + usuario + "!";
      }

      ModelAndView view = new ModelAndView("inicio");
      view.addObject("resultado", resultado);
      return view;
   }
}
