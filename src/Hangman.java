
public class Hangman {

  public static void main(String[] args) {
   
	  args = new String [] {"treehouse", "time", "Cassanova"};

    if(args.length == 0){
      System.out.println("Usage: java Hangman <answer>");
      System.err.println("answer is required");
      System.exit(1);
    }
    
    
    game Game = new game(args[0]);
    prompter Prompter = new prompter(Game); 
    while(Game.getRemainingTries() > 0 && !Game.isWon()){
    Prompter.displayProgress();
    Prompter.promptForGuess();
    }
    Prompter.displayOutcome();
   }
}

	  


