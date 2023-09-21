import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {
        
        Scanner be = new Scanner(System.in);

        System.out.println("Please enter the chess table size: ");
        int size = be.nextInt();

        be.close();

        for(int i = 0; i < size; i++)
        {
            for(int y = 0; y < size; y++)
            {
                if(i % 2 == 0)
                {
                    if(y % 2 == 0)
                    {
                        System.out.print("% ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
                else
                {
                    if(y % 2 == 0)
                    {
                        System.out.print("  ");
                    }
                    else
                    {
                        System.out.print("% ");
                    }
                }
            }
            System.out.println();;
        }
    }
}
