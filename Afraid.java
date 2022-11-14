package bridgelabz;

public class Afraid {

	public static void main(String[] args) {
		var fear = Math.floor(Math.random()*10)%2;
        if (fear==1) {
        	System.out.println("he is afraid towards snakes");
        }else {
        	System.out.println("he is brave towards snakes");
        }
	}

}
