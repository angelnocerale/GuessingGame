/*This Player Class uses the Singleton design, only one instantiated
object is created and this object can be accessed globally using a particular
method. The Player Class of the guessing game can do the following
*scan user input
The scanned user input is then stored in the private attribute number
this attribute is retrieved everytime main compares it to the random number generated*/

import java.util.*;//this is for the Scanner class
public class Player
{
	Scanner scan = new Scanner(System.in);
	private int number;
	private String name;
	private static Player player;

	/*The constructor is private to make sure instantiation outside the class
	impossible, this makes sure that only one instance of this class is created.*/
	private Player()
	{
		this.name = "Human Player";
	}

	/*this particular method created the singleton instance, it checks first if
	is there already an instantiated object, otherwise it creates one, and then 
	returns the instance.*/
	public static Player getPlayer()
	{
		if(player == null)
		{
			player = new Player();
		}
		return player;
	}

	/*This method sets the private attribute number through user input
	it also makes sure that the input is valid(within the range of 1 to 5) otherwise
	user must input a number again until input is valid.*/
	public void setNumber()
	{
		boolean check = false;
		while(!check)
		{
			System.out.print("Human Player: ");
			this.number = scan.nextInt();
			if(this.number>=1 && this.number<=5)
			{
				check = true;
			}
			else
			{
				System.out.println("Range: 1-5, Try Again.\n");
			}
		}
	}
	//self-explanatory
	public int getNumber()
	{
		return this.number;
	}

	//self-explanatory
	public String getName()
	{
		return this.name;
	}
	/*This method compares the randomnumber and userInput, and prints
	the result like so.*/
	public void checkGuess(int x)
	{
		if(this.number<x)
		{
			System.out.print("Guess is too low.\n");
		}
		else if(this.number>x)
		{
			System.out.print("Guess is too high.\n");
		}
	}
}