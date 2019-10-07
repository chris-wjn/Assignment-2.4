import java.util.Scanner;
public class RunningTally
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int i;
      int total = 0;
      System.out.println("enter non-decimal number. (enter a negative number to exit)");
        for (i = sc.nextInt(); i >= 0; i = sc.nextInt())
        {
            total = total + i;
        }
      System.out.println(total);
    }
}
