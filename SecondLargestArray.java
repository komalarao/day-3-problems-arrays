package bridgelabz;

public class SecondLargestArray {

	public static void main(String[] args) {
		int seclarge[]= { 56,34,90,11,5,2,76};
		int large = seclarge[2];
		int thirdlarge = seclarge[0];
		for ( int i=0;i<seclarge.length;i++) {
		if (seclarge[i]<large && seclarge[i]>thirdlarge) {
			int secondLargeElement = seclarge[i];
			System.out.println(secondLargeElement+" is second large element in the array");
		}
		}
		
		

	}

}
