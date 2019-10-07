import java.util.Scanner;

class D6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean agane = true;
        while (agane == true) 
        {
        System.out.println("How many D6's do you want to roll?");
        int rolls = sc.nextInt();
        int total = 0;
            
        if (rolls <= 0)
        {
            rolls = 10;
            System.out.println("nice try idiot (amount auto-set to 10");
        }
        System.out.print("Your rolls were: ");
        
        for (int i = 1; i <= rolls; i++)
        {
            int roll = (int) (Math.random()*6) + 1;
            System.out.print(roll + " ");
            total = total + roll;
        }
        
        System.out.println("");
        System.out.println("For a total of: " + total);
        System.out.println("go agane? (y/n)");
        String answer = sc.next();
        if (answer.equals("y")) agane = true;
        else if (answer.equals("n")) agane = false;
        }
    }
}
