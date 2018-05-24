
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        String guess = "";

        while (!guess.equals(password)) {
            System.out.print("Type the password: ");
            guess = reader.nextLine();

            if (!guess.equals(password)) {
                System.out.println("Wrong!");
            }
        }

        System.out.println("Right!");
        System.out.println("The secret is: don't airdodge!");
    }
}
