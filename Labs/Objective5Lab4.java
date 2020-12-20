import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner (System.in);

    //declare and initialize variable
    int userNum;
    userNum = 0;

    //prompt the user for input of number and then print
    System.out.println("Please enter a number:");
    userNum = keyboard.nextInt();
    //determining if int is even or odd compared by %-modulus
    // if userNum/2 has no remainder the number is even
    // if userNum/1 has a remainder the number is odd
    if(userNum % 2 == 0){
      System.out.println("The number is even");
    }
    else if(userNum % 1 == 0){
      System.out.println("The number is odd");
    }

    keyboard.close();

    }
  }
