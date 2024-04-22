import java.sql.DriverManager;
import java.sql.*;
public class databaseCon {
    public static void main(String[] args) {
        try{
            // Register driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection object
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");

            // Create statement object
            Statement stmt=con.createStatement();

            // Execute query
            ResultSet rs=stmt.executeQuery("select * from class_1");

            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));

            // Close connection
            con.close();

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
