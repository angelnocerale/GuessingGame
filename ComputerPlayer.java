/*The ComputerPlayer class is basically just the same as the Player class
with minimal difference(as in). I couldve just make it inherit from the player
class para ioverride nalang nako ang setNumber method since ag implementation
rjud ana maoy different, pero nagpaSingletonSingleton man lage ko. type nuon kog
balikbalik. Inheriting from class that follows the Singleton design is not good 
practice and by inheriting so, it breaks the rule of Signleton design, if I want to
make this class inherit from player, then might as well remove the Singlton design.
Daming hanash beh*/
import java.util.*;
public class ComputerPlayer
{
	private static ComputerPlayer computerPlayer;
	private int number;
	private String name;
	
	//refer to Player class for documentation
	private ComputerPlayer()
	{
		this.name = "Computer Player";
	}
	
	//refer to Player class for documentation
	public static ComputerPlayer getComputerPlayer()
	{
		if(computerPlayer == null)
		{
			computerPlayer = new ComputerPlayer();
		}

		return computerPlayer;
	}

	/*The only difference here is ComputerPlayergenerates its own randomNumber
	instead of user input.*/
	public void setNumber()
	{
		Random rand = new Random();
		this.number = rand.nextInt((5-1)+1) + 1;
	}
	public int getNumber()
	{
		return this.number;
	}
	public String getName()
	{
		return this.name;
	}
	
	//refer to Player class for documentation
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