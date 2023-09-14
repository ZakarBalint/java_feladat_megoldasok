import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        System.out.print("Please enter the square size: ");

        Scanner be = new Scanner(System.in);

        int size = be.nextInt();

        for(int i = 0; i < size; i++)
        {
            for(int y = 0; y < size; y++)
            {
                if(y == 0 || i == 0 || y == size - 1 || i == size - 1)
                {
                    System.out.print('%');
                }
                else
                {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }
    }
}
