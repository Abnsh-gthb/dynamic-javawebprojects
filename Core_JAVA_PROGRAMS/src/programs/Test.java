/**
 * 
 */
package programs;
import java.util.*;
/**
 * @author Abinash
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your first name -> ");
		String a =sc.nextLine();
		System.out.print("Enter your surname -> ");
		String b =sc.nextLine();
		String c= a+" "+b;
		System.out.print("\nYour name is -> "+c);
		sc.close();
	}
	

}
