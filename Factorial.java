import java.util.Scanner;

public class Factorial
{
    static void factorial_ciklus(int szam)
    {
        int factorial = 1;

        for(int i = szam; i > 0; i--)
        {
            factorial = factorial * i;
        }

        System.out.println(szam + " factoriálisa (ciklus): " + factorial);
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

        factorial_ciklus(szam);

        int ki = factorial_rekurziv(szam);

        System.out.println(szam + " factoriálisa (rekurzív): " + ki);

    }
}