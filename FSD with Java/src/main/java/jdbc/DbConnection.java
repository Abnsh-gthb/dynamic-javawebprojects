package jdbc;
import java.sql.DriverManager;
import java.sql.Connection;
/**
 * @author Abhinash
 *
 */
public class DbConnection {
	public Connection con=null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbConnection dc=new DbConnection();
		dc.dbconnect();
	}
	public Connection dbconnect()
	{
		try {
			System.out.println("Connecting.....");
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elitte","root","");
			System.out.println("SUCCESSFULLY CONNECTED WITH THE DATABASE");
		}
		catch(Exception e)
		{
			System.out.println("ERROR CANNOT CONNECT WITH THE DATABASE");
			e.printStackTrace();
		}
		return con;
	}
}
