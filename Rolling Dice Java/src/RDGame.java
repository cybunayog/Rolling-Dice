import java.util.*;


public class RDGame {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Random randy = new Random();

		int min = 1, max = 6;

		System.out.println("Would you like to roll the dice? (Y/N)");
		String roll_again = s.nextLine();
		
		do {
			System.out.println("Rolling the dices");
			System.out.println("The values are...");
			int randInt = randy.nextInt(max-min) + min;
			int randInt2 = randy.nextInt(max-min) + min;

			System.out.println(randInt);
			System.out.println(randInt2);
			
			//System.err.println("DEBUG");
			
			System.out.println("Would you like to roll again? (Y/N)");
			roll_again = s.nextLine();
			
		} while(roll_again.equals("yes") || roll_again.equals("y"));
		
		System.out.println("Thanks for playing!");
	}

}
