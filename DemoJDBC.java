import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
        Import package
        load and register
        Create connection
        Create Statement
        Execute Statement
        Process the result
        Close
        */

        String url = "jdbc:postgresql://localhost:5432/DemoPractice";
        String uName = "postgres";
        String pass = "Deb1234@";
        String query = "SELECT \"sName\" FROM student where \"sId\"=1";
        String entireTable = "select * from student";//sql query

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,uName,pass);
        System.out.println("Connection established");

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        // to check if the process is returning any data or not
        System.out.println("Getting any data?: "+rs.next());

        // to get the data
        System.out.println("Name of the Student: "+rs.getString("sName"));

        con.close();

    }
}
