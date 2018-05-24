public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        String stars = "";

        while (amount > 0) {
            stars += "*";
            amount --;
        }
        System.out.println(stars);
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        String spaces = "";

        while (amount > 0) {
            spaces += " ";
            amount --;
        }
        System.out.print(spaces);
    }

    public static void printTriangle(int size) {
        // 40.2
        int currSize = 1;

        while (currSize <= size) {
            printWhitespaces(size - currSize);
            printStars(currSize);
            currSize ++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int maxSize = 2 * height - 1;
        int currSize = 1;
        int baseSpace = (maxSize - 3) / 2;

        while (currSize <= maxSize) {
            printWhitespaces((maxSize - currSize) / 2);
            printStars(currSize);
            currSize += 2;
        }
        printWhitespaces(baseSpace);
        printStars(3);

        printWhitespaces(baseSpace);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
