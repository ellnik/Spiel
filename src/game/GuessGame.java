package game;

import java.util.Random;
import util.MyIO;

/**
 * The actual game
 */
public class GuessGame {

	int min; // Range-Minimum
	int max; // Range-Maximum

	int randomNumber;

	/**
	 * define min und max range
	 */
	void initGame() {
		min = MyIO.readInt("define min: ");
		max = MyIO.readInt("define max: ");

		while (max <= min) {
			MyIO.write("Max must be greater than Min!");
			max = MyIO.readInt("define max again: ");
		}
	}

	/**
	 * plays game rounds
	 */
	void round() {

		boolean onceAgain = true;

		while (onceAgain) {

			thinkUp();

			int playerNumber;
			boolean guessed = false;
			int attempts = 0;

			while (!guessed) {

				playerNumber = guess();
				attempts++;

				guessed = randomNumber == playerNumber;

				if (guessed) {
					MyIO.write("Well done! Attempts number: " + attempts);
				} else {
					if (playerNumber < randomNumber) {
						MyIO.write("Too small!");
					} else {
						MyIO.write("Too big!");
					}
				}

			}

			onceAgain = onceAgain();
		}

		MyIO.write("Bye");
	}

	boolean onceAgain() {

		MyIO.write("Next round?");
		MyIO.write("Type 'ß' for YES, type anything for NO");

		String answer = MyIO.read();

		if (answer.equals("ß"))
			return true;

		return false;
	}

	/**
	 * creates a random number
	 */
	void thinkUp() {
		Random rand = new Random();
		randomNumber = rand.nextInt(min, max + 1);
	}

	/**
	 * reads the player input
	 */
	int guess() {
		return MyIO.readInt("enter your number: ");
	}

}