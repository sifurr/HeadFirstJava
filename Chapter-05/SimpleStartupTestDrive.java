public class SimpleStartupTestDrive
{
	public static void main(String[] args)
	{
		SimpleStartup dot = new SimpleStartup();
		
		// make an int array for the location of the startup (3 consecutive ints out of possible 7)
		int[] locations = {2, 3, 4}; 
		
		// make the setter method on the startup
		dot.setLocationCells(locations);
		
		// make a fake user guess
		int userGuess = 2; 
		
		// invoke the checkYourself method on the Startup
		// object and pass it the fake guess
		String result = dot.checkYourself(useGuess);
		
		// 
		String testResult = "failed";
		if(result.equals("hit"))
		{
			// if the fake guess gives back a "hit", it's working
			testResult = "passed";
		}		
		System.out.println(testResult);		
	}
}
