public class RectangleChallenge {
  public static void main(String[] args) {
   printRectangleDoWhileLoop();
   System.out.println();
   printRectangleForLoop();
    }

    public static void printRectangleDoWhileLoop() {

    int b=0;
    do{
    int a=0;
    while(a<=19)
    {
    System.out.print("#");
    a++;
    }
    System.out.println();
    b++;
    }
    while(b<=9);
    }

    public static void printRectangleForLoop()
    {
      for(int a=0;a<=9;a++)
      {
          for(int b=0; b<=19;b++)
          {
            System.out.print("#");
          }
          System.out.println();

      }
    }
  }
