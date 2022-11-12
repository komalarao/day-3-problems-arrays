package bridgelabz;

public class SmallestElementArray {

	public static void main(String[] args) {
	   int arr[]= new int[] {556,665,889,3039,229};
	   int smaller=arr[0];
	   for (int i=0;i<arr.length;i++) {
	    if (arr[i]<smaller) { 
			 smaller=arr[i];
			 System.out.println(smaller+ "  is a smaller element in the array ");
	    }
	   }
	}
}
