import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        
        Scanner be = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int from = be.nextInt();

        System.out.print("Please enter the second number: ");
        int to = be.nextInt();
        be.close();

        if(to > from)
        {
            for(int i = from; i < to; i++)
            {
                System.out.println(i);
            }
        }
        else
        {
            System.out.println("The second number should be bigger");
        }
    }    
}
