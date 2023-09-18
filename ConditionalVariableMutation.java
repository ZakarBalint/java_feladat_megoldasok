import java.util.Scanner;

public class ConditionalVariableMutation {
    public static void main(String[] args) {
        System.out.println("Please enter an integer as variable");

        Scanner be = new Scanner(System.in);

        int a = be.nextInt();

        if(a % 2 == 0)
        {
            System.out.println(a + 1);
        }

        System.out.println("Please enter an integer between 0 and 30");
        int b = be.nextInt();

        if(b < 20 && b > 10)
        {
            System.out.println("Sweet!");
        }
        else if()
        {

        }
    }
}
