import java.util.Scanner;
public class Bar
{
    public static void main (String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the bar");
    int x = sc.nextInt();
    System.out.println("Enter the letter you bar should be made of");
    String letter = sc.next();
    for (int a = x; a >= 1; a--)
    {
      System.out.print(letter);   
    }   
    }
}