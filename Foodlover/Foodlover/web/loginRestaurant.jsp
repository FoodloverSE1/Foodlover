<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<!DOCTYPE html PUBLIC>
<html lang="de">
<head>
    <title>FOODLOVER - LOGIN</title>
    <meta charset="ISO-8859-1">
    <link href="stylelogin.css" rel=stylesheet type="text/css">
</head> 
    
    <body>
        
        <%
            try {
            String name = request.getParameter("Benutzer");
            String k�che = request.getParameter("k�che");
            String stra�e = request.getParameter("stra�e");
            String telefon = request.getParameter("telefon");
            String �ffnung = request.getParameter("zeit");
            String website = request.getParameter("website");
            String password = request.getParameter("Passwort");
            String email = request.getParameter("Email");
            //String again = request.getParameter("password_again");
            
            String sql ="Insert into Restaurant(Name,K�che,Stra�e,Telefonnummer,Email,�ffnungszeiten,Website,Passwort) values (?,?,?,?,?,?,?,?  )";         
 			String connectionURL = "jdbc:mysql://gauss.wi.hm.edu:3070/se1_foodlover?useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
 			Connection connection = null;
 			Class.forName("com.mysql.cj.jdbc.Driver");
 			connection=DriverManager.getConnection(connectionURL,"hashemi","Said.96");
           
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2,k�che);
            ps.setString(3,stra�e);
            ps.setString(4,telefon);
            ps.setString(5,email);
            ps.setString(6,�ffnung);
            ps.setString(7,website);
            ps.setString(8,password);
            ps.executeUpdate();
            
            out.println("Du hast dich erfolgreich registriert!");
            
            
            
        } catch (ClassNotFoundException ex ) {
            ex.printStackTrace();
          
        }
        %>  
        
    <th> <img src="logo.PNG" alt="logo.PNG"/></th>
    <br><br>
           <a href="index.jsp"><button>Home</button></a>
           <a href="restaurants.jsp"><button>Restaurants</button></a>
           <a href="kontakt.jsp"><button>Kontakt</button></a>
           <a href="reg.jsp"><button>Registrierung</button></a>
           <a href="login2.jsp"><button>Login</button></a>
           
    <br><br>
    <form action="LogSuccessR.jsp" method="post">
        
            <p>
            Benutzername: <input type="text" name="Benutzer" required="required" />
            </p>
            <p>
            Passwort:<input type="password" name="Passwort" required="required" />
            </p>
            <p>
            <a href="reg.jsp">Passwort vergessen?</a>
            </p>
            <p>
                <a href="login2.jsp"><button>Log dich ein!</button></a>
            
            </p>
        
            
            </p>
        
            <p>
            <a href="index.jsp">Oder direkt zu den Besten Restaurants der Stadt?</a>
            </p>
    </form>
    </body>
</html>