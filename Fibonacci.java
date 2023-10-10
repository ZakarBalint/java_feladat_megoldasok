import java.util.Scanner;

public class Fibonacci {

    static int fibonacci(int n)
    {
        if(n < 0)
        {
            return 0;
        }

        if(n <= 1)
        {
            return n;
        }
        else
        {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }       
    }

    public static void main(String[] args) {
            
        Scanner be = new Scanner(System.in);

        System.out.print("Adja meg a fibonacci sorozat hanyadik tagját szeretné: ");

        int n = be.nextInt();
        
        be.close();

        System.out.println("A fibonacci sorozat " + n + ". tagja a " + fibonacci(n));
    }       
}
