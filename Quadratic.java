import java.net.SecureCacheResponse;
import java.util.Scanner;

public class Quadratic {

    public static int quadratic(int a, int b, int c)
    {
        double d = (b*b)-(4*a*c);
        double e = b/2*a;

        if(d > 0)
        {
            double x1 = e + (Math.sqrt(d) / 2 * a);
            double x2 = e - (Math.sqrt(d) / 2 * a);

        }
        else if(d == 0)
        {
            
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Adja meg az a, b, c értékeket (a != 0) ebből az egyenletből f(x) = a  x^2 + b  x + c ");
        Scanner be = new Scanner(System.in);
        
        System.out.print("a: ");
        int a = be.nextInt();
        
        System.out.print("b: ");
        int b = be.nextInt();
        
        System.out.print("c: ");
        int c = be.nextInt();

        be.close();

        if(a != 0)
        {

        }
        else
        {
            System.out.println("Az a nem lehet 0!");
        }
    }
}
