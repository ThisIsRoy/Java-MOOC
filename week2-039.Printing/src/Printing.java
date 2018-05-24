public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times
        String stars = "";

        while (amount > 0) {
            stars += "*";
            amount --;
        }

        System.out.println(stars);
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int length = sideSize;
        while (length > 0) {
            printStars(sideSize);
            length --;
        }
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        while (height > 0) {
            printStars(width);
            height --;
        }
    }

    public static void printTriangle(int size) {
        // 39.4
        int currSize = 1;

        while (currSize <= size) {
            printStars(currSize);
            currSize ++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
