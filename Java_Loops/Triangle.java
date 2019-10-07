import java.util.Scanner;
public class Triangle
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the triangle");
    int x = sc.nextInt();
    if (x < 1) {
        System.out.println("nice try idiot");
        x = 10;
    }
    System.out.println("Enter the letter you triangle should be made of");
    String letter = sc.next();
    for (int a = 1; a <= x; a++)
    {
      for (int b = 1; b <= a; b++)
      {
          System.out.print(letter);
      }
      System.out.println("");
    } 
    }
}
