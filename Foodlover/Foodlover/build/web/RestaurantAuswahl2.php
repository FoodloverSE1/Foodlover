<!DOCTYPE html><html lang="de">    <meta charset="utf-8">    <?PHP    // Verbindung mit DB herstellen.    error_reporting(E_ALL);    include("../configs/config.php");     $db = mysqli_connect (MYSQL_HOST,                            MYSQL_BENUTZER,                            MYSQL_KENNWORT,                            MYSQL_DATENBANK);    if (!$db){        echo 'Verbindung fehlgeschlagen!';    }    // Ersetzt Sonderzeihen.    function special_characters($to_change){        return str_replace("_s","&szlig",$to_change);        //return $to_change;    }    ?><head>        <title>Restaurants 2</title>        <meta charset="utf-8"></head><body>    <img src="logo.PNG" alt="Logo" >       <div align="left"></div>           <a href="index.jsp" class="button"><button>Home</button></a>        <a href="restaurants.jsp" class="button"><button>Restaurants</button></a>        <a href="kontakt.jsp" class="button"><button>Kontakt</button></a>    <link rel="stylesheet" href="style.css" type="text/css">         <h1>Restaurants</h1>        <h2>Herzlich Willkommen</h2>        <p> Du hast dich für Food Lover entschieden und damit eine gute Wahl getroffen. Entdecke jetzt dein zukünftiges     Lieblings- Restaurants in München.        </p>    Deine Suche ergab folgende Restaurants:    <br>    <br>    <table>    <thead>        <tr>            <th width=100><b>Name</b></th>            <th width=150><b>Adresse</b></th>            <th width=100><b>Telefonnr.</b></th>            <th width=100><b>E-mail</b></th>            <th width=100><b>Öffnungszeiten</b></th>            <th width=100><b>Webseite</b></th>        </tr>        <?PHP            $tail = "";            $is_first = true;            if($_GET['asian'] == "true"){                if($is_first){                    $is_first = false;                } else {                    $tail .= " OR ";                }                $tail .= "kueche='Asiatisch'";            }            if($_GET['indian'] == "true"){                if($is_first){                    $is_first = false;                } else {                    $tail .= " OR ";                }                $tail .= "kueche='Indisch'";            }            if($_GET['italian'] == "true"){                if($is_first){                    $is_first = false;                } else {                    $tail .= " OR ";                }                $tail .= "kueche='Italienisch'";            }            if($_GET['turkey'] == "true"){                if($is_first){                    $is_first = false;                } else {                    $tail .= " OR ";                }                $tail .= "kueche='Tuerkisch'";            }            if($_GET['persian'] == "true"){                if($is_first){                    $is_first = false;                } else {                    $tail .= " OR ";                }                $tail .= "kueche='Persisch'";            }            $sql = "SELECT name, strasse, telefonnummer, email, oeffnungszeiten, webseite FROM Restaurant WHERE " . $tail;            $result = $db->query($sql);        if($result){            if ($result->num_rows > 0) {                while($row = $result->fetch_assoc()) {                echo "<tr><td>".$row["name"]."</td><td>".special_characters($row["strasse"])."</td><td>".$row["telefonnummer"]."</td><td>".$row["email"]."</td><td>".$row["oeffnungszeiten"]."</td><td>".$row["webseite"]."</td></tr>";                }            }        }        ?>    </thead>    </table></body></html>