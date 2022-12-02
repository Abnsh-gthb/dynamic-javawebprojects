/**
 * 
 */
package create_table;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Mainak Deb
 *
 */
public class TestApplication {
	static final String DB_URL="jdbc:mysql://localhost:3306/elitte";
	static final String USER="root";
	static final String PASS="";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
				Statement stmt =conn.createStatement();
				)
		{			String sql= "INSERT INTO College" +
				"VALUES ('Abinsh', 'Chakraborty', 23, 'Kolkata','jdfhufhuihfiuh@gmail','5878754588' )";
					
					
//					"CREATE TABLE College"+
//					"(id INTEGER not NULL,"+
//					"first_name VARCHAR(255), "+
//					"last_name VARCHAR(255), "+
//					"age INTEGER,"+
//					"address VARCHAR(255),"+
//					"email_id VARCHAR(100), "+
//					"phone_number INTEGER(20), "+
//					"PRIMARY KEY(id))";

			stmt.executeUpdate(sql);
			System.out.println("TABLE CREATED SUCCESSFULLY IN THE DATABASE");
		}
		catch(SQLException e){
			System.out.println("ERROR ! FAILED TO CREATE THE TABLE IN DATABASE");
			e.printStackTrace();
		}	
	}
}
