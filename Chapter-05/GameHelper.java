import java.util.Scanner;

public class GameHelper
{
	int getUserInput(String prompt)
	{
		System.out.print(prompt + ": ");
		Scanner sc = new Scanner(System.in);
		
		return sc.nextInt();
	}
}

