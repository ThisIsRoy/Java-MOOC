import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int count = 0;
        int evenCount = 0;
        int oddCount = 0;

        while (num != -1) {
            System.out.print("Type a number: ");
            num = Integer.parseInt(reader.nextLine());
            if (num != -1) {
                sum += num;
                count ++;

                if (num % 2 == 0) {
                    evenCount ++;
                } else {
                    oddCount ++;
                }

            }
        }
        System.out.println("Type numbers:");
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);

        double average =  1.0 * sum / count;

        System.out.println("Average: " + average);

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
