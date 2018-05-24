public class BoundedCounter {
    private int value = 0;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.upperLimit = upperLimit;
    }

    public void next() {
        // write code here
        if (this.value < this.upperLimit) {
            this.value ++;
        } else {
            this.value = 0;
        }
    }

    public String toString() {
        // write code here
        String value = "" + this.value;
        if (this.value < 10) {
            value = "0" + value;
        }

        return value;
    }

    public void setValue(int inputValue) {
        if (inputValue >= 0 && inputValue <= this.upperLimit) {
            this.value = inputValue;
        }
    }

    public int getValue() {
        return this.value;
    }
}