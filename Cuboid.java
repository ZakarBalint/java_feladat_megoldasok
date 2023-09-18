public class Cuboid {
    public static void main(String[] args) {
        double a = 10.4;
        double b = 13.5;
        double c = 8.2;

        double A = 2*(a * a) + 2*(b * b) + 2*(c * c);

        double V = a * b * c;

        System.out.println("Surface Area: " + A);

        System.out.println("Volume: " + V);
    }
}
