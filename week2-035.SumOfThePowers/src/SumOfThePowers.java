
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");

        int num = Integer.parseInt(reader.nextLine());

        int count = 0;
        int sum = 0;

        while (count <= num) {
            sum += Math.pow(2, count);
            count += 1;
        }

        System.out.println("The result is " + sum);
    }
}
