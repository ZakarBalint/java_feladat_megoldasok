import java.net.SecureCacheResponse;
import java.util.Scanner;

public class Quadratic {

    public static double quadratic(int a, int b, int c)
    {
        double d = (b*b)-(4*a*c);

        if(d > 0.0)
        {
            double x1 = (-b + (Math.sqrt(d) / 2.0 * a));
            double x2 = (-b - (Math.sqrt(d) / 2.0 * a));

            return x1, x2;
        }
        else if(d == 0.0)
        {
            double x1 = -b / (2.0 * a);
            return x1;
        }
        else if(d < 0.0)
        {
            return -1.0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Adja meg az a, b, c értékeket (a != 0) ebből az egyenletből f(x) = a  x^2 + b  x + c ");
        Scanner be = new Scanner(System.in);
        
        System.out.print("a: ");
        double a = be.nextDouble();
        
        System.out.print("b: ");
        int b = be.nextDouble();
        
        System.out.print("c: ");
        int c = be.nextDouble();

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
