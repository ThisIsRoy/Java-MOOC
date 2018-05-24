
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner reader = new Scanner(System.in);
        // write here code to ensure that BoundedCounter works as expected
        // before starting 78.3 remove the extra code and use the skeleton shown
        // in the assignment

        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s = Integer.parseInt(reader.nextLine());

        System.out.print("minutes: ");
        int m = Integer.parseInt(reader.nextLine());

        System.out.print("hours: ");
        int h = Integer.parseInt(reader.nextLine());

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while ( i < 121 ) {
            System.out.println( hours + ":" + minutes + ":" + seconds );   // the current time printed

            // advance seconds
            seconds.next();

            if (seconds.toString().equals("00")) {
                minutes.next();

                if (minutes.toString().equals("00")) {
                    hours.next();

                    if (hours.toString().equals("00")) {
                        minutes.setValue(0);
                        seconds.setValue(0);
                    }
                }

            }
            // if minutes become zero, advance hours
            i++;
        }
    }
}
