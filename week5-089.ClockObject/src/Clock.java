public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        this.hours = new BoundedCounter(23);
        this.hours.setValue(hoursAtBeginning);

        this.minutes = new BoundedCounter(59);
        this.minutes.setValue(minutesAtBeginning);

        this.seconds = new BoundedCounter(59);
        this.seconds.setValue(secondsAtBeginning);
    }
    
    public void tick() {
        // Clock advances by one second
        this.seconds.next();
        if (this.seconds.getValue() == 0) {
            this.minutes.next();

            if (this.minutes.getValue() == 0) {
                this.hours.next();
            }
        }
    }
    
    public String toString() {
        // returns the string representation
        String stringRep = "";
        if (this.hours.getValue() < 10) {
            stringRep += "0";
        }
        stringRep += this.hours.getValue() + ":";

        if (this.minutes.getValue() < 10) {
            stringRep += "0";
        }
        stringRep += this.minutes.getValue() + ":";

        if (this.seconds.getValue() < 10) {
            stringRep += "0";
        }
        stringRep += this.seconds.getValue();

        return stringRep;
    }
}
