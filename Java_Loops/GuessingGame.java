import java.util.Scanner;
public class GuessingGame
{
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     int num = (int) (Math.random()*100) + 1;
     System.out.println("I've thought of a random number between 1 and 100,");
     System.out.println("Take a guess.");
     int guess = 0;
     int tries = 0;
     while (guess != num)
     {
         guess = sc.nextInt();
         if (guess > num) System.out.println("Too high");
         if (guess < num) System.out.println("Too low");
         else if (guess == num) guess = num;
         tries++;
     }
     System.out.println("Wow! You guessed the number. Good work.");
     System.out.println("It took you " + tries + " tries.");
    }
}