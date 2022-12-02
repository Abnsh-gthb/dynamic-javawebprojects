package programs;
import java.io.FileWriter;
import java.io.IOException;

public class File_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter myWriter = new FileWriter("filename.txt");
			myWriter.write("Files in Java might be tricky, but it is fun enough!");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		}
		catch (IOException e) {
			System.out.println("An Error occured");
			e.printStackTrace();
			
		}

	}

}
