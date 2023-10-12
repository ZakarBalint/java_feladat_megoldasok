import java.util.Scanner;

public class AnimalsAndLegs
{
    public static void main(String[] args)
    {
        Scanner be = new Scanner(System.in);
        

        System.out.print("Hány csirke van: ");

        int csirkek = be.nextInt();

        System.out.print("Hány malac van: ");

        int malac = be.nextInt();

        be.close();

        System.out.print("A lábak száma: " +  ((2 * csirkek) + (4 * malac)));
    }
}