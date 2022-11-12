package bridgelabz;
import java.util.Scanner;
public class PrintArrayelements {
	
	public static void main(String[] args) {
		Scanner number= new Scanner(System.in);
	    System.out.println("enter the size of array:");
	    int size= number.nextInt();
	    int array[] = new int [size];
	   for ( int i=0;i<array.length;i++) {
		   System.out.println("enter elements of array:");
		   array[i]=number.nextInt();
	   }  System.out.println("entered array is"); 
	   for ( int arrayelement :array) {
	   System.out.println(arrayelement +  " ");
	   
	   }
	}
}
