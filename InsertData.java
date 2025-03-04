import java.sql.*;

public class InsertData {
        public static void main(String[] args) throws ClassNotFoundException, SQLException {

            String url = "jdbc:postgresql://localhost:5432/DemoPractice";
            String uName = "postgres";
            String pass = "Deb1234@";
            String insertData= "insert into student values (7,'Lily',35)";//sql query

            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url,uName,pass);
            System.out.println("Connection established");
            Statement st = con.createStatement();
            st.execute(insertData);


            con.close();
            System.out.println("Connection closed");

        }
}
