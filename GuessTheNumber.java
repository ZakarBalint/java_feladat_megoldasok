import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int szam =  (int)Math.round(Math.random() * 10);

        Scanner be = new Scanner(System.in);

        boolean kitalat = false;

        do
        {
            System.out.print("Please enter your guess: ");
            int tipp = be.nextInt();

            if(tipp == szam)
            {
                kitalat = true;

                System.out.println("You have found the stored number " + szam);

            }
            else if(tipp > szam)
            {
                System.out.println("The stored number is smaller than " + tipp);
            }
            else if(tipp < szam)
            {
                System.out.println("The stored number is greater than " + tipp);
            }

        }while(!kitalat);

        be.close();

    }
}
