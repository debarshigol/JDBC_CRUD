import java.sql.*;

public class CompleteTable {
        public static void main(String[] args) throws ClassNotFoundException, SQLException {

            String url = "jdbc:postgresql://localhost:5432/DemoPractice";
            String uName = "postgres";
            String pass = "Deb1234@";
            String entireTable = "select * from student";//sql query

            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url,uName,pass);
            System.out.println("Connection established");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(entireTable);
            while (rs.next()) {
                System.out.print(rs.getInt(1)+" - ");
                System.out.print(rs.getString(2)+" - ");
                System.out.print(rs.getInt(3));
                System.out.println();
            }

            con.close();
            System.out.println("Connection closed");

        }
    }

