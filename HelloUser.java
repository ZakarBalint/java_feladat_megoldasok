import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet the User instead of the World!
        // The program should ask for the name of the User
        //
        // Example:
        //
        // Please enter your name: John Doe
        // Hello, John Doe!
        //

        String name = "World";

        Scanner be = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        name = be.nextLine();
        be.close();

        System.out.printf("Hello, %s!", name);
    }
}