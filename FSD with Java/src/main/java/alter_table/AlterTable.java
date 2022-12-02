/**
 * 
 */
package alter_table;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Abinash
 *
 */
public class AlterTable {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("SQL ALTER TABLE");
		Connection con = null;
		String url="jdbc:mysql://localhost:3306/";
		String dbName="elitte";
		String driverName="com.mysql.jdbc.Driver";
		String userName="root";
		String password="";

		try {
			
			Class.forName(driverName);
			con=DriverManager.getConnection(url + dbName , userName , password);
			
			try {
				Statement st=con.createStatement();
				String sql="ALTER TABLE students CHANGE abinash phone_number VARCHAR(150)";
				st.executeUpdate(sql);
				System.out.println("TABLE IS ALTERED SUCCESSFULLY");
			}
			catch(SQLException e){
				System.out.println("ERROR !");
				e.printStackTrace();
			}con.close();
		}
		catch(Exception e) {
			System.out.println("DATABASE ERROR !");
			e.printStackTrace();
		}
	}
}
