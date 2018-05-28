
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Said
 */
public class Main {
    public static void main(final String... args) throws SQLException, ClassNotFoundException{
        // Datenbank erzeugen.
        final DBAnbindung db = new DBAnbindung("com.mysql.cj.jdbc.Driver", "jdbc:mysql://localhost:3306/se1_foodlover?serverTimezone=UTC", "root", "Zwilling00");
        db.connect();
        // 
        db.send("INSERT INTO `test` SET `A`=4, `B`=44");
        
        
        
    }
}
