import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class ConditionalVariableMutation {
    public static void main(String[] args) {
        System.out.println("Please enter an integer");

        Scanner be = new Scanner(System.in);

        int a = be.nextInt();

        if(a % 2 == 0)
        {
            System.out.println(a + 1);
        }

        System.out.println("Please enter an integer between 0 and 30");
        int b = be.nextInt();

        if(b <= 20 && b >= 10)
        {
            System.out.println("Sweet!");
        }
        else if(b < 10)
        {
            System.out.println("Less!");
        }
        else if(b > 20)
        {
            System.out.println("More!");
        }

        System.out.println("Please enter an integer between 0 and 100");

        int credits = be.nextInt();

        System.out.println("Please enter a boolean (true/false)");

        boolean isBonus = be.nextBoolean();

        if(credits >= 50 && isBonus == false)
        {
            System.out.println(credits - 2);
        }
        else if(credits <= 50 && isBonus == false)
        {
            System.out.println(credits - 1);
        }
        else if(isBonus == true)
        {
            System.out.println(credits);
        }

        System.out.println("Please enter an integer between 0 and 50");

        int d = be.nextInt();

        System.out.println("Please enter an integer between 0 and 500");

        int time = be.nextInt();

        if(d % 4 == 0 && !(time > 200))
        {
            System.out.println("Check");
        }
        else if(time > 200)
        {
            System.out.println("Time out");
        }
        else
        {
            System.out.println("Run Forest Run!");
        }

        be.close();

    }
}
