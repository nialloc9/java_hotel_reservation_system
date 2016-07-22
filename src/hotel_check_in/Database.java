package hotel_check_in;

import java.sql.*;
import sun.net.smtp.SmtpClient;

public class Database {
    private String url;
    private String user;
    private String password;
    
    //CONSTRUCTOR
    public Database(){
        url = "jdbc:mysql://127.0.0.1:3306/hotel";
        user = "root";
        password = "";
    }
    
    //ADD TO DATABASE
    public void add_to_database(String fn, String ln, String ph, String em, String ad, String dd, String at, String dt, String g, String rt, String nr, String c){
        Connection myConn = null;
	PreparedStatement stmt = null;
	ResultSet result = null;
        
        try{
            myConn = DriverManager.getConnection(url,user,password);
            stmt = myConn.prepareStatement("INSERT INTO `guests`(`firstname`, `lastname`, `phone`, `email`, `arrival_date`, `departure_date`, `arrival_time`, `departure_time`, `no_of_guests`, `room_type`, `no_of_rooms`, `comments`) \n" +
"VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, fn);
            stmt.setString(2, ln);
            stmt.setString(3, ph);
            stmt.setString(4, em);
            stmt.setString(5, ad);
            stmt.setString(6, dd);
            stmt.setString(7, at);
            stmt.setString(8, dt);
            stmt.setString(9, g);
            stmt.setString(10, rt);
            stmt.setString(11, nr);
            stmt.setString(12, c);
            
            stmt.executeUpdate();
            
            System.out.println("Guest insert complete");
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    //GET FROM DATABASE
    public ResultSet get_from_database(){
        Connection myConn = null;
	PreparedStatement stmt = null;
	ResultSet result = null;
        
        try{
        myConn = DriverManager.getConnection(url,user,password);
        stmt = myConn.prepareStatement("SELECT * FROM guests");
        
        result = stmt.executeQuery();
        
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return result;
    }

}
