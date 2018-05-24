
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.print("Type a number:" );
        int firstNum = Integer.parseInt(reader.next());

        System.out.print("Type another number:" );
        int secondNum = Integer.parseInt(reader.next());

        int result = Math.max(firstNum, secondNum);

        System.out.println("The bigger of the two numbers given was: " + result);
    }
}
