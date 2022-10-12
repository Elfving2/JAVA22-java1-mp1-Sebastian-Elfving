import java.util.Scanner;

class main {
public static void main(String [] args) {
  int random = (int)Math.round(Math.random() * 100);
  System.out.println(random);
  int numberOfGuesses = 0;
  System.out.println("Enter a number 0 - 100");

  Scanner sc = new Scanner(System.in);

  while(true) {
    numberOfGuesses ++;
    int userInput = sc.nextInt();
    System.out.println(numberGuessingGame(random,userInput));
    while(random == userInput) {
      System.out.println("Times guessed was " +  numberOfGuesses + " times");
      numberOfGuesses = 0;
      System.out.println("Play again by typing a new number!");
      random = (int)Math.round(Math.random() * 100);
      //System.out.println(random);
    }

  }


}


  static String numberGuessingGame(int random, int userInput) {
    if(userInput == random) {
      return "Correct!";
    }
    else if(userInput < random) {
      return "Number is Bigger";
    }
    else{
      return "Number is Smaller";
    }
  }
}
