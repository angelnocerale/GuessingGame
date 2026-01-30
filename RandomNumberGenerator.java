/*The RandomNumberGenerator Class purpose is to generate random numbers
it follows the singletone design also, only one instance of this class
is created through out the program, the number generated si ALWAYS random
through the call of a particular method.*/
import java.util.*;//this is for the Random class
public class RandomNumberGenerator
{
	private int number;
	private static Random rand = new Random();
	private static RandomNumberGenerator rng;
	/*Private constructor to ensure instantion throughout the program
	impossible. */
	private RandomNumberGenerator()
	{
		this.number=0;
	}
	/*The method returns the instance object, checks if null, if so 
	create new object, and then return the object.*/
	public static RandomNumberGenerator getRNG()
	{
		if(rng == null)
		{
			rng = new RandomNumberGenerator();
		}
		return rng;
	}
	/*This returns the random number generated*/
	public int getNumber()
	{
		this.number =  rand.nextInt((5-1)+1) + 1;//this is the formula for generating randomNumber in java ITATAK MO ITO SA ULO MO VERY IMPORTANT!!!
		return this.number;
	}

}