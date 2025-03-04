import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
        public static void main(String[] args) throws ClassNotFoundException, SQLException {

            String url = "jdbc:postgresql://localhost:5432/DemoPractice";
            String uName = "postgres";
            String pass = "Deb1234@";
            String DeleteData = "delete from student where \"sId\" = 6;";//sql query

            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url, uName, pass);
            System.out.println("Connection established");
            Statement st = con.createStatement();
            st.execute(DeleteData);

            con.close();
            System.out.println("Connection closed");

        }
    }
