<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import= "java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Log dich ein!</title>
        <link rel="stylesheet" href="style.css" type="text/css">
    </head>
    <body>
        
       <%
            try {
            String name = request.getParameter("Benutzer");
            String password = request.getParameter("Passwort");
            
            String sql ="Insert into Nutzer(Username,Password) values (?,?)";           
 			String connectionURL = "jdbc:mysql://gauss.wi.hm.edu:3070/se1_foodlover?useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
 			Connection connection = null;
 			Class.forName("com.mysql.cj.jdbc.Driver");
 			connection=DriverManager.getConnection(connectionURL,"hashemi","Said.96");
           
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2,password);
            ps.executeUpdate();
            
            out.println("Du hast dich erfolgreich registriert!");
            
            
            
        } catch (ClassNotFoundException ex ) {
            ex.printStackTrace();
          
        }
        %>  
        
        <div align ="center">
             <h2> Log dich ein!</h2>
             <form
                 action="home.jsp" method="post"> 
                 Benutzername: <input type="text" name="Benutzer" required="required">
                 Passwort: <input type="password" name="Passwort" required="required">
                 <input type="submit" value="Jetzt einloggen!">
                
            </form>
        </div>
          

    </body>
</html>
