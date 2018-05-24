
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);

        String nameInput = "start";
        String numberInput;
        ArrayList<Student> list = new ArrayList<Student>();

        while (!nameInput.equals("")) {
            System.out.print("name: ");
            nameInput = reader.nextLine();

            if (!nameInput.equals("")) {
                System.out.print("studentnumber: ");
                numberInput = reader.nextLine();

                Student newStudent = new Student(nameInput, numberInput);
                list.add(newStudent);
            }
        }

        for (Student student: list) {
            System.out.println(student);
        }
        System.out.print("Give search term: ");
        String search = reader.nextLine();
        System.out.println("Result:");
        for (Student student: list) {
            if (student.getName().contains(search)) {
                System.out.println(student);
            }
        }
    }
}
