class SimpleStartupGame
{
	public static void main(String[] args)
	{
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();
		
		SimpleStartup startup = new SimpleStartup();
		int randomNumber = (int)(Math.random() * 5);
		
		int[] locations = {randomNumber, randomNumber + 1, randomNumber +2};
		startup.setLocationCells(locations);
		boolean isAlive = true;
		
		while(isAlive)
		{
			int guess = helper.getUserInput("enter a number");
			String result = startup.checkYourself(guess);		
			
			if(result.equals("kill"))
			{
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			} // end if
		} // end while
	} // end main
} // end class
