import java.util.Scanner;

public class Factorial
{
    static int factorial_ciklus(int szam)
    {
        int factorial = 1;

        for(int i = szam; i > 0; i--)
        {
            factorial = factorial * i;
        }

        return factorial;
    }

    static int factorial_rekurziv(int szam)
    {
        if(szam > 1)
        {
            return szam * factorial_rekurziv(szam - 1);
        }
        else
        {
            return 1;
        }
    }

    public static void main(String[] args) {
        
        System.out.println("Adjon meg egy pozitív egész számot: ");
        Scanner be = new Scanner(System.in);

        int szam = be.nextInt();

        be.close();

        System.out.println(szam + " factoriálisa (ciklus): " + factorial_ciklus(szam));

        System.out.println(szam + " factoriálisa (rekurzív): " + factorial_rekurziv(szam));

    }
}