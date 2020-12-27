public class Objective7Lab4 {
  public static void main(String[] args) {
    int currentSum = 0;
    int counter = 0;

    while (counter <= 20) {
      currentSum = counter + currentSum;
      ++ counter;
    }
    System.out.println(currentSum);
  }
}
