<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FOODLOVER - REGISTRIERUNG</title>
    </head>
    <body>
        <div align="center">
    <th> <img src="logo.PNG" alt="logo.PNG"/></th>
    <br>
         
           <a href="index.jsp"><button>Home</button></a>
           <a href="restaurants.jsp"><button>Restaurants</button></a>
           <a href="kontakt.jsp"><button>Kontakt</button></a>
           <a href="reg.jsp"><button>Registrierung</button></a>
           <a href="login2.jsp"><button>Login</button></a>
    
    <br><br/>
        <th> <img src="NochKeinFoodlover.PNG" alt="logo.PNG"/></th>
        <h4>Jetzt schnell und einfach loslegen! </h4>

        
        <form action="login.jsp" method="post">
            Benutzername: <input type="text" name="Benutzer" required="required" />
            <br>
            <br>
            E-Mail-Adresse: <input type="email" name="Email" required="required" />
            <br>
            <br>
            Passwort: <input type="password" name="Passwort" required="required" />
            <br>
            <br>
            Passwort erneut eingeben: <input type="password" name="password_again" required="required" />
            <br>
            <br>
            <input type="submit"  value="Jetzt Registrieren!" />
            </form>
        
        <th> <img src="FoodloveVerbreiten.PNG" alt="logo.PNG" width="240" height="50"/></th>
        <br>
        <p></p>
        <form action="loginRestaurant.jsp" method="post">
            Benutzername (Name des Restaurant): <input type="text" name="Benutzer" required="required" />
            <br>
            <br>
            Küche: <input type="text" name="küche" required="required" />
            <br>
            <br>
            Straße: <input type="text" name="straße" required="required" />
            <br>
            <br>
            Telefonnummer: <input type="tel" name="telefon" required="required" />
            <br>
            <br>
            E-Mail-Adresse: <input type="email" name="Email" required="required" />
            <br>
            <br>
            Öffnungszeiten: <input type="text" name="zeit" required="required" />
            <br>
            <br>
            Website: <input type="url" name="website" required="required" />
            <br>
            <br>
            Passwort: <input type="password" name="Passwort" required="required" />
            <br>
            <br>
            Passwort erneut eingeben: <input type="password" name="password_again" required="required" />
            <br>
            <br>
            <input type="submit"  value="Jetzt Registrieren!" />
            </form>
        
       </div> 
     
    </body> 
</html>