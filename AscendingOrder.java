package bridgelabz;

public class AscendingOrder {

	public static void main(String[] args) {
		int value = 0;
		int ascending[]= {820,260,340,23,227};
		for (int i=0;i<ascending.length;i++) {
			for (int j=i+1;j<ascending.length;j++) {
				if (ascending[i]>ascending[j]) {
				 value = ascending[i];
				 ascending[i] = ascending[j];
				 ascending[j] = value;
				}
					
			}
		}
                    System.out.println();		
		            System.out.println("reverse order of array" );
	              for (int i=0;i<ascending.length;i++) {
	        	   System.out.println(ascending[i]+ " ");
	           }
	        	   
			

	}

}
