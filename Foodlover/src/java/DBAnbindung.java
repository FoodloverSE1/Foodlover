import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;


public class DBAnbindung {
    
    Connection connection;
    
    // JDBC Driver Name und DB URL
   static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3306/?serverTimezone=UTC";
   
   // Anmeldedaten
   static final String USERNAME = "root";
   static final String PASSWORD = "Zwilling00";
 
   public DBAnbindung(final String JDBC_DRIVER, final String DB_URL, final String USERNAME, final String PASSWORD){
       // TODO Methoden statt Funktionen und Objekte statt statisch!!!
   }
   
public static void main(final String... args){
   Connection connection = null;
   Statement stmt = null;
   
   try{
      //Driver erzeugen
      Class.forName(JDBC_DRIVER);

      //Verbindung herstellen 
      System.out.println("Verbindung mit Datenbank herstelle ...");
      connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

      //Query ausführen
      System.out.println("Erzeuge Datenbank...");
      stmt = connection.createStatement();
      
      // Hier wird das SQL-Statement angegeben!!!
      final String sql = "CREATE DATABASE Test";
      stmt.executeUpdate(sql);
      System.out.println("Die Datenbank wurde erfolgreich angelegt...");
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      }// nothing we can do
      try{
         if(connection!=null)
            connection.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
   }
   System.out.println("Tschau!");
}
}
