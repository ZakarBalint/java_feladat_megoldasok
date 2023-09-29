import java.util.Scanner;

public class SumDigits {

    public static int sumdigits(int szam)
    {
        int sum = szam % 10;

        if(szam == 0)
        {
            return 0;
        }
        else
        {
            return sum + sumdigits(szam / 10);
        }
    }

    public static void main(String[] args) {
        System.out.print("Adjon meg egy nem negatív egész számot: ");
        Scanner be = new Scanner(System.in);

        int szam = be.nextInt();

        be.close();

        System.out.println("A számjegyek összege: " + sumdigits(szam));
    }
}
