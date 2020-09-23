public class SnakeLadderUc1
{
	 public static void main(String[] args) 
	 {
		 int START_POS = 0;
		 
		 int NO_PLAY  = 1;
		 
		 int SNAKE = 2;
		 
		 int LADDER = 3;
		 
		 int rollCount1 = 0;
		 int rollCount2 = 0;

		 int win_position = 10;
	
		 int player1_position = START_POS; 
		 int player2_position = START_POS; 
		 
		 int PlayerTurn;
		  
		 int Player1 = 1;
		 int Player2 = 2;
		 		 		 
		 while(player1_position != win_position && player2_position != win_position)
		 {
			 PlayerTurn = (int)Math.floor(Math.random()*2 + 1);
			 if(PlayerTurn == Player1)
			 {
				 int die_number = (int)Math.floor(Math.random()*6 + 1);
				 int options = (int)Math.floor(Math.random()*3 + 1);
				 
				 if(options == NO_PLAY)
				 {
					 player1_position = player1_position + 0;
				 }
				 else if(options == SNAKE)
				 {
					 player1_position = player1_position - die_number;
					 if(player1_position<0)
					 {
						 player1_position = 0;
					 }
				 }
				 else if(options == LADDER)
				 {
					 while(options == LADDER)
					 {
						 die_number = (int)Math.floor(Math.random()*6 + 1);
						 options = (int)Math.floor(Math.random()*3 + 1);
						 
						 player1_position = player1_position + die_number;	 
						 if(player1_position > win_position)
						 {
							 player1_position = player1_position - die_number;
						 }
					 }
				 }
				 rollCount1++;
			 }
			 else if(PlayerTurn == Player2)
			 {
				 int die_number = (int)Math.floor(Math.random()*6 + 1);
				 int options = (int)Math.floor(Math.random()*3 + 1);
				 
				 if(options == NO_PLAY)
				 {
					 player2_position = player2_position + 0;
				 }
				 else if(options == SNAKE)
				 {
					 player2_position = player2_position - die_number;
					 if(player2_position<0)
					 {
						 player2_position = 0;
					 }
				 }
				 else if(options == LADDER)
				 {
					 while(options == LADDER)
					 {
						 die_number = (int)Math.floor(Math.random()*6 + 1);
						 options = (int)Math.floor(Math.random()*3 + 1);
						 
						 player2_position = player2_position + die_number;	 
						 if(player2_position >win_position)
						 {
							 player2_position = player2_position - die_number;
						 }
					 }
				 }
				 rollCount2++;			 
		 }
		 
	 }
		 if(rollCount1 > rollCount2)
			System.out.println("Player 1 Won");
		 else
			System.out.println("Player 2 Won");
}
}
