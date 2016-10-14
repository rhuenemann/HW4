
package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Xboxgames;


public class ReadQuery {
    
    private Connection conn;
    private ResultSet results;
    
    public ReadQuery(){
    
    Properties props = new Properties();
    InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    String driver = props.getProperty("driver.name");
    String url = props.getProperty("server.name");
    String username = props.getProperty("user.name");
    String password = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void doRead(){
        
        try{
            String query;
            query = "Select * from xboxgames";

            PreparedStatement ps;
            ps = conn.prepareStatement(query);
            this.results = ps.executeQuery();
        }catch (SQLException ex){
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }
    
    public String getHTMLtable(){
        
        String table = "";
        
        table += "<table border=1>";
        
        try {
            while(this.results.next()){
                
                Xboxgames xboxgame = new Xboxgames();
                xboxgame.setGameid(this.results.getInt("gameid"));
                xboxgame.setTitle(this.results.getString("title"));
                xboxgame.setReleasedate(this.results.getInt("Releasedate"));
                xboxgame.setDeveloper(this.results.getString("developer"));
                xboxgame.setRating(this.results.getString("rating"));
                
                table += "<tr>";
                
                    table += "<td>";
                    table += xboxgame.getGameid();
                    table += "</td>";

                    table += "<td>";
                    table += xboxgame.getTitle();
                    table += "</td>";

                    table += "<td>";
                    table += xboxgame.getReleasedate();
                    table += "</td>";

                    table += "<td>";
                    table += xboxgame.getDeveloper();
                    table += "</td>";

                    table += "<td>";
                    table += xboxgame.getRating();
                    table += "</td>";
                
                table += "</tr>";
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

            
        table += "</table>";
                return table;
                
                
        
    }
    
}
