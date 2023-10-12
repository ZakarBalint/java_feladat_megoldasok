import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
     
        Scanner be = new Scanner(System.in);

        System.out.print("Please enter the triangle height:");

        int height = be.nextInt();
        be.close();

        for(int i = 1; i <= height; i++)
        {
            for(int y = 1; y <= i; y++)
            {
                System.out.print('*');
            }

            System.out.println();
        }
    }
}
