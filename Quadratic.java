import java.util.Scanner;

public class Quadratic {

    public static String quadratic(double a, double b, double c)
    {
        double d = b * b - 4.0 * a * c;

        if(d > 0.0)
        {
            double x1 = (-b + Math.sqrt(d)) / (2.0 * a);
            double x2 = (-b - Math.sqrt(d)) / (2.0 * a);

            return "2 zérushelye van melyek: x1 = " + x1 + " x2 = " + x2;
        }
        else if(d == 0.0)
        {
            double x = -b / (2.0 * a);
            return "1 zérushelye van mely: x = " + x;
        }
        else if(d < 0.0)
        {
            return "Nincs megoldása";
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println("Adja meg az a, b, c értékeket (a != 0) ebből az egyenletből f(x) = a  x^2 + b  x + c ");
        Scanner be = new Scanner(System.in);
        
        System.out.print("a: ");
        double a = be.nextDouble();
        
        System.out.print("b: ");
        double b = be.nextDouble();
        
        System.out.print("c: ");
        double c = be.nextDouble();

        be.close();

        if(a != 0)
        {
            System.out.println("Az egyneletnek " + quadratic(a, b, c));
        }
        else
        {
            System.out.println("Az a nem lehet 0!");
        }
    }
}
