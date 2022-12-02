/**
 * 
 */
package delete_table;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Mainak Deb
 *
 */
public class DeleteTable {

	/**
	 * @param args
	 */
	static final String DB_URL="jdbc:mysql://localhost:3306/elitte";
	static final String USER="root";
	static final String PASS="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
				Statement stmt =conn.createStatement();
				)
		{
			String sql="DROP TABLE college";
			stmt.executeUpdate(sql);
			System.out.println("TABLE DELETED SUCCESSFULLY");
		}
		catch(SQLException e){
			System.out.println("ERROR ! DELETING THE TABLE FROM THE DATABASE");
			e.printStackTrace();
		}
	}
}