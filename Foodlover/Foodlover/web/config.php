<?php
// die Konstanten auslagern in eigene Datei
// die dann per require_once ('konfiguration.php'); 
// geladen wird.
 
// Damit alle Fehler angezeigt werden
error_reporting(E_ALL);
 
// Zum Aufbau der Verbindung zur Datenbank
// die Daten erhalten Sie von Ihrem Provider
define ( 'MYSQL_HOST','"jdbc:mysql://gauss.wi.hm.edu:3070/se1_foodlover?useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false"' );
 
// bei XAMPP ist der MYSQL_Benutzer: root
define ( 'MYSQL_BENUTZER',  'hashemi' );
define ( 'MYSQL_KENNWORT',  'Said.96' );
// für unser Bsp. nennen wir die DB adressverwaltung
define ( 'MYSQL_DATENBANK', 'se1_foodlover' );
?>