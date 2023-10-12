import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        System.out.print("Please enter the pyramid height: ");

        Scanner be = new Scanner(System.in);

        int height = be.nextInt();

        be.close();
                  
        for (int i = 0; i < height; i++)
        {
            for (int j = height - i; j > 1; j--)
            {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++ )
            {
                System.out.print("* ");
            }
  
            System.out.println();
        }

        
        for (int i = 1; i <= height; i++)
        {
          for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
          for (int j = i; j <= height; j++)
            {
                System.out.print("* ");
            }  
            System.out.println();
        }
        
    }
}
