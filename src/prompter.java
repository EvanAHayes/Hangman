import java.util.Scanner;

class prompter {
  private game Game;
  
  public prompter (game Game){
    this.Game = Game; 
  }
  
  public boolean promptForGuess(){ 
    Scanner scanner = new Scanner(System.in);
    boolean isHit = false; 
    boolean isAcceptable = false; 
    
    do {
    System.out.print("Enter a letter  ");
    //scanner uses next line to read a line
    String GuessInput = scanner.nextLine();
   
    
    try { isHit = Game.applyGuess(GuessInput);
         isAcceptable = true; 
    }
    catch (IllegalArgumentException iae){
      System.out.printf("%s. Please try again %n", 
                        iae.getMessage());
    }
    } while (! isAcceptable);
      
    return isHit;
    
  }
  public void displayProgress(){
    System.out.printf("You have %d tries left to solve: %s %n", 
                      Game.getRemainingTries(),
                      Game.getCurrentProgress());
  }
  public void displayOutcome(){
    if(Game.isWon()){
      System.out.printf("congradulations you won with %d tries. %n", 
                        Game.getRemainingTries());
    }
    else {
      System.out.printf("bummer the word was %s %n",
                       Game.getAnswer());
    }
  }
}

	

