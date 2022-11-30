/**
 * This class is just for free flowing 
 * code writing where many concepts have 
 * been introduced
 */

public class SharpenYourPencil76
{
	public static void main(String[] args)
	{
		int size = 27; // declare an integer variable named 'size' and give it the value 27
		String name = "Fido"; // declare a string of characters 
							 // variable named 'name' and give it the value "Fido"
		Dog myDog = new Dog(name, size); // declare a new Dog variable
										 // 'myDog' and make the new Dog using 'name' and 'size'
		x = size - 5; // subtract 5 from 27 and assign it to a variable named 'x'
		if(x < 15) myDog.bark(8); // if x is less then 15, tell the dog to bark 8 times
		
		while(x > 3) // keep looping as long as x is greater than 3
		{
			myDog.play(); // tell the dog to play
		} // end while loop
		
		int[] numlist = {2, 4, 6, 8}; // declare a list of integers' variable
									  // 'numlist' and put 2,4,6,8 into the list
		System.out.println("Hello"); // print "Hello" at the command line
		System.out.println("Dog: " + name); // print "Dog: Fido" at the command line
		String num = "8"; // declare a character string variable
						  // 'num' and give it the value "8"
		int z = Integer.parseInt(num); // convert the string of characters
									   // "8" into an actual numeric value 8
		
		try // try to do something even it doesn't work
		{
			readTheFile("myFile.txt"); // read a text file named "myFile.txt"
		}
		catch(FileNotFoundException ex) // if the tried thing doesn't work 
										// than treat it as FileNotFoundException error
		{			
			System.out.print("File not found."); // if "FileNotFoundException" is caught 
												 // then print "File not found" at the command line 
		}
		
		
		 
		
		
		
}
