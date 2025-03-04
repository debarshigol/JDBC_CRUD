import java.sql.*;
import java.util.Scanner;

public class DynamicData {
        public static void main(String[] args) throws ClassNotFoundException, SQLException {

            // this is for inserting a new row
            // same method can be applicable for other types of operations
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the mentioned data: ");
            System.out.println("Enter your id: ");
            int sId = input.nextInt();
            input.nextLine();// to catch buffer line
            System.out.println("Enter your Name: ");
            String sName = input.nextLine();
            System.out.println("Enter your Marks: ");
            int marks = input.nextInt();


            String url = "jdbc:postgresql://localhost:5432/DemoPractice";
            String uName = "postgres";
            String pass = "Deb1234@";
            String insertData= "insert into student values (?,?,?)";//sql query

            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url,uName,pass);
            System.out.println("Connection established");

            PreparedStatement st = con.prepareStatement(insertData);
            st.setInt(1,sId);
            st.setString(2,sName);
            st.setInt(3,marks);
            
            st.execute();


            con.close();
            System.out.println("Connection closed");

        }
    }

