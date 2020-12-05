import java.util.Random;

public class SnakeLadder {
		//UC-1:Initializing variables;
		static int player = 0;
		static int position = 0;
		
		public static void main(String[] args) {
			System.out.println("Number after rolling dice"+rollDice());
		System.out.println("The position is"+position());
			   
		}
		private static String position() {
			// TODO Auto-generated method stub
			return null;
		}
		//UC-2:Generating Random Number;
		static  int rollDice() {
		    int n = 0;
		    Random r = new Random();
		    n=r.nextInt(7);
		    return n;
			}    

			//UC-3:
		static int move() {
			int Option=(int)(Math.random()*10%3+1);
			if(Option==1) {
				System.out.println("no play");
			return position;
			}
			if(Option==2) {
				System.out.println("snakes");
			return position;
			}
			if(Option==3) {
				System.out.println("ladder");
			return position;
			}
			return position;	
			
			
	}
}


