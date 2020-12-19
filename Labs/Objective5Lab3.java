import java.util.Scanner;

public class Objective5Lab3 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner (System.in);

    //declare and initialize variable
    int userNum;
    userNum = 0;

    //Prompt and print user input for desired number
    System.out.println("Please enter a number: ");
    userNum = keyboard.nextInt();

    //Print positive, negative, or equals
    if(userNum > 0) {
    System.out.println("The number is positive");
    }
    else if(userNum < 0) {
    System.out.println("The number is negative");
    }
    else {
    System.out.println("The number is equal to zero ");
    }

    keyboard.close();
  }
}
