import java.util.Scanner;

public class AverageOfInput
{
    public static void main(String[] args) 
    {
        Scanner be = new Scanner(System.in);


        int sum = 0;
        double avg = 0;

        for(int i = 0; i < 5; i++)
        {
            System.out.print("Please enter a number: ");
            sum += be.nextInt();
        }
        be.close();

        avg = Double.valueOf(sum / 5);

        System.out.println("Sum: " + sum + " Avg: " + avg);
    }
}