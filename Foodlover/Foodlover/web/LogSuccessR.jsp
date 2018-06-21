<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import= "java.sql.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" href="style.css" type="text/css">
    </head>
    <body>
        <%try {
            String name = request.getParameter("Benutzer");
            String password = request.getParameter("Passwort");
            String dbName = null;
            String dbPassword = null;   
            String sql ="select * from Restaurant where name=? and password=?";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://gauss.wi.hm.edu:3070/se1_foodlover?useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false");
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2,password);
            ResultSet rs = ps.executeQuery();
             
            while (rs.next()){
                dbName = rs.getString("Name");
                dbPassword = rs.getString("Passwort");
            }
            if(name.equals(dbName)&& password.equals(dbPassword)){
                out.println("Du hast dich erfolgreich eingeloggt!");
            } else {
                response.sendRedirect("login2.jsp");
            }
     
            
        } catch (Exception ex) {
           
            ex.printStackTrace();
        }
        %>
        <th> <img src="logo.PNG" alt="logo.PNG"/></th>
        <br>
        <a href="index.jsp"><button>Home</button></a>
           <a href="restaurants.jsp"><button>Restaurants</button></a>
           <a href="kontakt.jsp"><button>Kontakt</button></a>
           <a href="reg.jsp"><button>Registrierung</button></a>
           <a href="login2.jsp"><button>Login</button></a>
           <br>
        <h2>Hey, <%= request.getParameter("Benutzer")%> </h2>
            Willkommen auf FoodLover!
    </body>
</html>
