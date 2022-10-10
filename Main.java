import java.util.Scanner;

class main {
  public static void main(String[] args) {
    //Generera random nummer
    int random = (int) Math.round(Math.random() * 100);
    System.out.println(random);

    //boolean som ska bli false när spelaren har gissat rätt.
    boolean numberNotCorrect = true;
    boolean numberCorrect = false;

    //antal gissningar
    int guesses = 0;

    //skapa user input
    Scanner newScanner = new Scanner(System.in);

    //jämföra nummer och input
    while (numberNotCorrect) {
      System.out.println(numberNotCorrect);
      //sätta scanner till att gissa integer nummer.
      int userInput = newScanner.nextInt();
      //användarens tal är större än random numret.
      if (userInput > random) {
        guesses++;
        System.out.println("Nummer är lägre");
      }
      //användarens tal är mindre än random numret
      else if (userInput < random) {
        guesses++;
        System.out.println("Nummer är större");
      }
      //Ifall användaren gissar rätt
      else {
        guesses++;
        System.out.println("Antal gissningar: " + guesses);
        System.out.println("Du gissa rätt!");
        cheekifcorrect(numberNotCorrect,numberCorrect);
        System.out.println(cheekifcorrect(numberNotCorrect,numberCorrect));
        //reset
        guesses = 0;
        //reset
        random = (int) Math.round(Math.random() * 100);
        System.out.println(random);

      }
    }
  }

  static boolean cheekifcorrect(boolean numberNotCorrect, boolean numberCorrect) {
    numberNotCorrect = numberCorrect;
    return numberNotCorrect;
  }
}