public class Objective3Lab3 {
  public static void main(String[] args) {
    int number1, number2, number3, total;

    number1 = 1+ (int)(Math.random() * 6);
    number2 = 1+ (int)(Math.random() * 6);
    number3 = 1+ (int)(Math.random() * 6);
    total = ((number1 + number2 + number3));

    System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + total);
  }
}
