public class GuessGame
{
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame()
	{
		// create three Player objects and assign them to 
		// the three Player instance variables.
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		// declare three variables to hold the three 
		// guesses the Player make.
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		// declare three variables to hold a true or 
		// false based on the player's answer.
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		// make a 'target' number that the player has to guess
		int targetNumber = (int) (Math.random() * 10;
		System.out.println("I'm thinking of a number between 0 and 9...");
		
		while(true)
		{
			System.out.println("Number to guess is " + targetNumber);
			
			// call each player's guess() method
			p1.guess();
			p2.guess();
			p3.guess();
			
			// get each player's guess that has 
			// been returned by guess() method.
			guessp1 = p1.number;
			System.out.println("Player one guessed " + guessp1);
			
			guessp2 = p2.number;
			System.out.println("Player two guessed " + guessp2);
			
			guessp3 = p3.number;
			System.out.println("Player three guessed " + guessp3);
			
			// check the player's guess to see if the 
			// answer matches the target number. If 
			// matched the set that player's variable to
			// true
			if(guessp1 == targetNumber)
			{
				p1isRight = true;
			}
			if(guessp2 == targetNumber)
			{
				p2isRight = true;
			}
			if(guessp3 == targetNumber)
			{
				p3isRight = true;
			}
			
			// print the result on the console
			if(p1isRight || p1isRight || p3isRight)
			{
				System.out.println("We have a winner!");
				System.out.println("Player one got it right? " + p1isRight);
				System.out.println("Player two got it right? " + p2isRight);
				System.out.println("Player three got it right? " + p3isRight);
				System.out.println("Game is over.");
				
				break; // break the while loop
				
			}
			else
			{
				// keep going because nobody got it right
				System.out.println("Please woll have to try again.");
			} // end if/else			
		} // end while loop			
	} // end startGame method
} // end class
