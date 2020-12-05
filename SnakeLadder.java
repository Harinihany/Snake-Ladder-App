import java.util.Random;

public class SnakeLadder {
	//Initializing variables;
		static int player = 0;
		
		public static void main(String[] args) {
			System.out.println("Number after rolling dice"+rollDice());
		}
			//UC-2-Generating Random Number;
		static  int rollDice() {
		    int n = 0;
		    Random r = new Random();
		    n=r.nextInt(7);
		    return n;
		} 
	   
}


