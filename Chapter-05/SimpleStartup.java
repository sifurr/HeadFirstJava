class SimpleStartup
{
	private int[] locationCells;
	private int numberOfHits = 0;
	

	public void setLocationCells(int[] locs)
	{
		locationCells = locs;
	}
	

	public String checkYourself(int guess) // GET the user guess
	{
		String result = "miss";
		
		for(int cell : locationCells) // REPEAT	with each cell in the int array
		{
			if(guess == cell) // IF the user guess matches
			{
				result = "hit";
				numberOfHits++; // INCREAMENT the number of hits
				break;
			} // end if
		} // end for
		
		if(numberOfHits == locationCells.length) // IF the number of hits is 3
		{
			result = "kill"; // return kill as a result
		} // end if
		System.out.println(result);
		return result;
	}
}
