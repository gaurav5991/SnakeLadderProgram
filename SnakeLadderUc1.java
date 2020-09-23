public class SnakeLadderUc1
{
	public static void main(String[] args)
	{
		int START_POS = 0;
		int NO_PLAY = 1;
		int SNAKE = 2;
		int LADDER = 3;
		int win_position = 100;
		int position = START_POS;

		int roll_count = 0;
		
		while(position != win_position)
		{
			int die_Number = (int)Math.floor(Math.random()*6 + 1);
			int options = (int)Math.floor(Math.random()*3 + 1);

			if(options == NO_PLAY)
			{
				position += 0;
			}
			else if(options == SNAKE)
			{
				position  = position - die_Number;
				if(position < 0)
				{
					position = 0;
				}
			}
			else if(options == LADDER)
			{
				position = position + die_Number;	
				if(position > win_position)
				{
					position = position - die_Number;
				}
			}
			roll_count++;
			System.out.println("Position of Player: " +  position);
		}		
		
		System.out.println("Number of Timed Die rolled: " + roll_count);
	}
}