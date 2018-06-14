<!DOCTYPE html PUBLIC>
<html lang="de">
<head>
    <title>FOODLOVER - LOGIN</title>
    <meta charset="ISO-8859-1">
    <link href="stylelogin.css" rel=stylesheet type="text/css">
</head> 
    
    <body>
    <th> <img src="logo.PNG" alt="logo.PNG"/></th>
    <form action="send.html" method="post">
        
           <p>
            <label for="Email Adresse"> Email Adresse:
            <input id="Email-Adresse" type="email" required />
            </label>  
            </p>
            
            <p>
            <label for="Passwort"> Passwort:
            <input id="Passwort" type="password" required />
            </label>
           </p>
        
            <p>
            <a href="passwort_vergessen.html">Passwort vergessen?</a>
            </p>
            
            <p>
            <button name="absenden" value="abgesendet" type="submit">Anmelden</button>
            </p>
        
            <img src="WEB-INF/NochKeinFoodlover.PNG" height="auto" width="25%" >
        
            <p>
                <a href="register.jsp"><button>Jetzt Registrieren</button></a>
            </p>
        
            <p>
            <a href="überuns.jsp">Oder direkt zu den Besten Restaurants der Stadt?</a>
            </p>
    </form>
    </body>
</html>