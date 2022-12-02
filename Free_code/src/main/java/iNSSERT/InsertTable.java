package iNSSERT;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
 
public class InsertTable {
	
	
	
  public static void main(String[] args) {
   
	  try {
    	Class.forName("com.mysql.jdbc,Driver");
    	DriverManager.getConnection("jdbc:mysql://localhost:3306/elitte","root","");
    	
    }
    catch(Exception e) {
    	throw new RuntimeException("Something Went wrong");
    }
  }
}