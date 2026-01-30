public class Main
{
	public static void main(String[] args)
	{
		Player player = Player.getPlayer();
		ComputerPlayer computerPlayer = ComputerPlayer.getComputerPlayer();
		boolean win = false;
		RandomNumberGenerator rng = RandomNumberGenerator.getRNG();
		
		/*This loop will run until one of the players
		matches the randomNumber generated.*/
		while(!win)
		{
			player.setNumber();
			computerPlayer.setNumber();
			System.out.println(computerPlayer.getName()+": "+computerPlayer.getNumber());
			int randomNumber = rng.getNumber();
			System.out.println("Generated Number: "+ randomNumber);
			
			/*This block checks for winner and prints it like so.*/
			if(player.getNumber()==randomNumber || computerPlayer.getNumber()==randomNumber)
			{
				win = true;
				if(player.getNumber()==randomNumber)
				{
					System.out.println("Winner: "+player.getName());
				}
				if(computerPlayer.getNumber() == randomNumber)
				{
					System.out.println("Winner: "+computerPlayer.getName());	
				}
			}

			/*This block checks the number of the players if its
			too high or too low, and prints it like so.*/
			else
			{
				System.out.print(player.getName()+", ");
				player.checkGuess(randomNumber);
				System.out.print(computerPlayer.getName()+", ");
				computerPlayer.checkGuess(randomNumber);
			}

			/*This is spacing for every round if neither of the player
			matches the random generated number.*/
			System.out.println();	
		}
	}
}