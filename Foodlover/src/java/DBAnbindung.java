import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;


public class DBAnbindung {
    
    Connection connection;
    
    // JDBC Driver Name und DB URL
   final String JDBC_DRIVER;  
   final String DB_URL;
   
   /**
    * Anmeldedaten.
    */
   final String USERNAME;
   
   /**
    * Passwort.
    */
   final String PASSWORD;
 
   /**
    * Custom Ctor für DB.
    * 
    * @param JDBC_DRIVER
    * @param DB_URL
    * @param USERNAME
    * @param PASSWORD 
    */
   public DBAnbindung(final String JDBC_DRIVER, final String DB_URL, final String USERNAME, final String PASSWORD){
       // TODO Methoden statt Funktionen und Objekte statt statis
       this.JDBC_DRIVER = JDBC_DRIVER;
       this.DB_URL = DB_URL;
       this.USERNAME = USERNAME;
       this.PASSWORD = PASSWORD;
   }
   
   public void connect() throws SQLException, ClassNotFoundException{
       
      //Driver erzeugen
      Class.forName(JDBC_DRIVER);

      //Verbindung herstellen 
      System.out.println("Verbindung mit Datenbank herstelle ...");
      connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
   }
   
   /**
    * SQL Statement versenden.
    * 
    * @param sql 
    * @throws SQLException 
    */
   public void send(final String sql) throws SQLException{
       Statement stmt = connection.createStatement();
        // TODO Statement an Datenbank senden.
       stmt.executeUpdate(sql);
       System.out.println("Statement erfolgreich abgesendet!");
   }

/**
 * Getter für Password.
 * 
 * @return 
 */
public String get_password(){
    return this.PASSWORD;
}

}
