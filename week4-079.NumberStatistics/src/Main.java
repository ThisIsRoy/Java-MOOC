import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order
        NumberStatistics allNum = new NumberStatistics();
        NumberStatistics evenNum = new NumberStatistics();
        NumberStatistics oddNum = new NumberStatistics();



        System.out.println("Type numbers:");
        int userInput = Integer.parseInt(reader.nextLine());

        while (userInput != -1) {
            allNum.addNumber(userInput);
            if (userInput % 2 == 0) {
                evenNum.addNumber(userInput);
            } else {
                oddNum.addNumber(userInput);
            }

            userInput = Integer.parseInt(reader.nextLine());
        }

        System.out.println("sum: " + allNum.sum());
        System.out.println("sum of even: " + evenNum.sum());
        System.out.println("sum of odd: " + oddNum.sum());
    }
}
