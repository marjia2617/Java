package chapterFour;

// Write an expression that obtains a random integer between 34 and 55. Write an 
//expression that obtains a random integer between 0 and 999. Write an expression 
//that obtains a random number between 5.5 and 55.5.

public class Three {

	public static void main(String[] args) {
		
		int x = 34 + (int)(Math.random() * 21);
		int y = (int)(Math.random() * 1000);
		double z = 5.5 + Math.random() * 50;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(Math.round(z * 100.0 )/ 100.0);
		

	}

}
