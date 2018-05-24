import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner reader = new Scanner(System.in);

        String userInput = "";
        Database database = new Database();

        while (!userInput.equals("Quit")) {
            System.out.print("? ");
            userInput = reader.nextLine();

            if (userInput.equals("Add")) {
                System.out.print("Name: ");
                String birdName = reader.nextLine();
                System.out.print("Latin Name: ");
                String birdLatinName = reader.nextLine();
                database.addBird(new Bird(birdName, birdLatinName));

            } else if (userInput.equals("Observation")) {
                System.out.print("What was observed:? ");
                String observedBird = reader.nextLine();

                if (database.observeBird(observedBird) == 0) {
                    System.out.println("Is not a bird!");
                }

            } else if (userInput.equals("Statistics")) {
                database.printBirds();

            } else if (userInput.equals("Show")) {
                System.out.print("What? ");
                String birdName = reader.nextLine();
                database.showBird(birdName);
            }
        }
    }

}
