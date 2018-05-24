import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        int[] grades = new int[6];
        int numGrades = 0;

        int userCommand = 0;
        System.out.println("Type exam scores, -1 completes");

        while (userCommand != -1) {
            userCommand = Integer.parseInt(lukija.nextLine());

            if (userCommand != -1) {
                if (userCommand >= 0 && userCommand <= 60) {
                    addGrade(grades, userCommand);
                }
            }
        }

        readGrades(grades);
    }

    public static void addGrade(int[] grades, int newGrade) {
        if (newGrade >= 50) {
            grades[5] ++;
        } else if (newGrade >= 45) {
            grades[4] ++;
        } else if (newGrade >= 40) {
            grades[3] ++;
        } else if (newGrade >= 35) {
            grades[2] ++;
        } else if (newGrade >= 30) {
            grades[1] ++;
        } else {
            grades[0] ++;
        }
    }

    public static void readGrades(int[] grades) {
        int numGrades = 0;

        System.out.println("Grade distribution:");
        for (int i = grades.length - 1; i >= 0; i--) {
            numGrades += grades[i];
            System.out.print(i + ": ");

            for (int j = 0; j < grades[i]; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }

        System.out.println("Acceptance percentage: " + 100.0 * (numGrades - grades[0]) / numGrades);
    }
}
