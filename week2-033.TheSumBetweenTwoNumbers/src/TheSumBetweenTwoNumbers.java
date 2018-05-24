
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First: ");
        int firstNum = Integer.parseInt(reader.nextLine());

        System.out.print("Second: ");
        int secondNum = Integer.parseInt(reader.nextLine());

        int sum = 0;
        int count = firstNum;

        while (count <= secondNum) {
            sum += count;
            count ++;
        }

        System.out.println("Sum is " + sum);
    }
}
