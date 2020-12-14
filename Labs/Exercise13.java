import java.util.Scanner;

public class Exercise13 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    System.out.print("Please enter the word \"wombat\": ");
    String wombat = kb.nextLine();
    boolean isWombat = wombat.equals("wombat");
    System.out.println("You successfully entered the word \"wombat\": " + isWombat + "\n");

    System.out.print("Please DO NOT enter the word \"wombat\": ");
    String notWombat = kb.nextLine();
    boolean isNotWombat = !(notWombat.equals("wombat"));
    System.out.println("You successfully DID NOT enter the word \"wombat\": " + isNotWombat);

    /* Try to avoid the NOT operator it is better practice in code
    /readability and future debugging to use something along the
    lines of

    ex. if ((a.b && c.d.e) || !f);

    instead use

    bool isOK = a.b;
    bool isStillOk = c.d.e
    bool alternateOK = !f

    ex. if ( (isOK && isStillOk) || alternateOk); */
  }
}
