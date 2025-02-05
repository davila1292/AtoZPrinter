package alphabet;

public class Letters {
	
	public static void main(String args[]) {

		char letter = 'A';

		switch (letter) {

		case 'A':
			System.out.println("This is letter: A.");
			break;
		case 'B':
			System.out.println("This is letter: B.");
			break;
		case 'C':
			System.out.println("This is letter: C.");
			break;
			
			/**
			 * Let's complete the alphabet. You can add 1 - 5 cases per push, so everyone in the team can participate.
			 */

		default:
			System.out.println("This is not a letter from alphabet");
		}

	}

}
