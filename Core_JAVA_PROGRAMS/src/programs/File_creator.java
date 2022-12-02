package programs;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class File_creator {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Your File Name ->");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		try {
			File myObj= new File(str);
			if(myObj.createNewFile()) {
				System.out.println("File created: "+ myObj.getName());
				String[] k= {"o","n","e"};
				main(k);
			}
			else {
				System.out.println("File alresdy Exixst..");
			}}
			catch(IOException e){
				System.out.println("An error occured....");
				e.printStackTrace();
			}
			sc.close();
			
				
			}
		}

	
	
	

	