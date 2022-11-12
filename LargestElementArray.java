package bridgelabz;

public class LargestElementArray {
	
	public static void main(String[] args) {
		int arr[]=new int[] {11,98,76,87,99};
		int larger = arr[1];
		 for (int i = 0; i < arr.length; i++) {  
	          
	           if(arr[i] > larger)  
	               larger = arr[i];  
	        }  
	        System.out.println("Largest element present in given array: " +larger);
	}
}