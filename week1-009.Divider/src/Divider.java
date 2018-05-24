
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.print("Type a number: ");
        int firstNum = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int secondNum = Integer.parseInt(reader.nextLine());

        double result = 1.0 * firstNum / secondNum;
        System.out.println("Division: " + firstNum + " / " + secondNum + " = " + result);
    }
}
