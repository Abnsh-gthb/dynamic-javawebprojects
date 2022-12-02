package programs;

public class java_array {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] me= {4,5,6,9};
//		int[] you= new int[3];
//		System.arraycopy(me, 0, you, 0, 2);
//		for(int i=0; i<me.length; i++) {
//			System.out.print(me[i]+"  ");
//		}
//
		// Input array a[]
        int a[] = { 1, 8, 3,5,6 };
 
        // Create an array b[] of same size as a[]
        int b[] = new int[a.length];
 
        // Copying elements of a[] to b[]
        for (int i = 0; i < a.length; i++)
            b[i] = a[i];
 
        // Changing b[] to verify that
        // b[] is different from a[]
        b[0]++;
 
        // Display message only
        System.out.println("Contents of a[] ");
 
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
 
        // Display message only
        System.out.println("\n\nContents of b[] ");
 
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
    }
	
	
	
	
	
	
	
	
	}
	
	
	
	
