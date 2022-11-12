package bridgelabz;

public class DuplicateElementArray {

	public static void main(String[] args) {
        int ray[] = new int[] {889,776,995,1234,776,995};
       for (int i=0;i<ray.length;i++) {
    	   for(int j=i+1;j<ray.length;j++) {
    		   if (ray[i]==ray[j]) {
    			   System.out.println(ray[i]+"is duplicate number");
    		   }
    	   }
       }

	}

}
