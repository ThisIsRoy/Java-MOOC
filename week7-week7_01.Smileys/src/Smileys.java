
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys(".87");
        // printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {
        int charLen = characterString.length();
        int smileyLen = charLen % 2 == 0 ? charLen + 6 : charLen + 7;

        printSmileyLine(smileyLen);
        printSmileySurround(characterString, charLen);
        printSmileyLine(smileyLen);
//        for (int i = 0; i < smileyLen / 2; i++) {
//            System.out.print(":)");
//        }
//        System.out.println("");
//
//        if (charLen % 2 == 0) {
//            System.out.println(":) " + characterString + " :)");
//        } else {
//            System.out.println(":) " + characterString + "  :)");
//        }
//
//        for (int i = 0; i < smileyLen / 2; i++) {
//            System.out.print(":)");
//        }
//        System.out.println("");
    }

    public static void printSmileyLine(int smileyLen) {
        for (int i = 0; i < smileyLen / 2; i++) {
            System.out.print(":)");
        }
        System.out.println("");
    }

    public static void printSmileySurround(String characterString, int smileyLen) {
        if (smileyLen % 2 == 0) {
            System.out.println(":) " + characterString + " :)");
        } else {
            System.out.println(":) " + characterString + "  :)");
        }
    }
}
