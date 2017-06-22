<html>
<head>
<title>Inicio</title>
</head>
  <body bgcolor="white">
  
    <form method="post" action="inicio">
        <div>
          <span>Usuario: </span><br />
            <input type=text size="15" name="usuario" >
        </div>
        <div>
            <span>Clave: </span><br />
            <input type=password size="15" name="password" >
        </div>
        <div><input type=submit name="submit" value="Ok"></div>
      </form>

    
    <div>
      <%
          {
            java.lang.String respuesta = (java.lang.String)request.getAttribute("resultado");   
      %>
      <span><%=respuesta%></span>
      <%
          }
      %>
    </div>
  </body>
</html>
