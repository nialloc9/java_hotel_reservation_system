package hotel_check_in;

import java.sql.*;

public class Display{
    
        private String display;
        public String print_to_screen(ResultSet set) throws SQLException{
            System.out.println("Start");
            while(set.next()){
            String firstname = set.getString("firstname");
            String lastname = set.getString("lastname");
            String phone = set.getString("phone");
            String email = set.getString("email");
            String arrival_date = set.getString("arrival_date");
            String departure_date = set.getString("departure_date");
            String arrival_time = set.getString("arrival_time");
            String departure_time = set.getString("departure_time");
            String no_of_guests = set.getString("no_of_guests");
            String room_type = set.getString("room_type");
            String no_of_rooms = set.getString("no_of_rooms");
            String comments = set.getString("comments");
            
            display = firstname + " " + lastname + " Phone Number: " + phone + " Email: " + email + " arriving at " + arrival_date + " " + arrival_time + " Departing at " + departure_date + " " + departure_time
                              + " No. of Guests: " + no_of_guests + " Rooms: " + no_of_rooms + " " + room_type + " Additional Comments " + comments + "\n\n";
            
            
   
    }
            
            return display;
        }
}
