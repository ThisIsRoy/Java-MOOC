import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    int passLen;
    Random random = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.passLen = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String randomPass = "";
        String alpha = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < this.passLen; i++) {
            randomPass += alpha.charAt(this.random.nextInt(26));
        }
        return randomPass;
    }
}
