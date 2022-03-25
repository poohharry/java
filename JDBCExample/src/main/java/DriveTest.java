import java.sql.*;

public class DriveTest {
	public static void main(String[] args) {
		Connection con;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:8085/testdb", "root", "jiwoosky2!");
			System.out.println("Success");
		} catch (SQLException ex) { System.out.println("SQLException : " + ex);}
		  catch (Exception ex) {System.out.println("Exception : " + ex);}
	}
}
