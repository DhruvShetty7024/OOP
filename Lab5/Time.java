class Time {
    private int hours;
    private int minutes;
    private int seconds;

    // Constructor to initialize time to zero
    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    // Constructor to initialize time to a fixed value
    public Time(int hours, int minutes, int seconds) {
        setTime(hours, minutes, seconds);
    }

    // Set the time to a fixed value
    public void setTime(int hours, int minutes, int seconds) {
        if (hours >= 0 && hours < 24 && minutes >= 0 && minutes < 60 && seconds >= 0 && seconds < 60) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        } else {
            System.out.println("Invalid time values. Time not set.");
        }
    }

    // Display the time in hh:mm:ss format
    public void displayTime() {
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }

    // Add two Time objects and return the result as a new Time object
    public Time addTime(Time otherTime) {
        int newHours = this.hours + otherTime.hours;
        int newMinutes = this.minutes + otherTime.minutes;
        int newSeconds = this.seconds + otherTime.seconds;

        if (newSeconds >= 60) {
            newMinutes += newSeconds / 60;
            newSeconds %= 60;
        }
        if (newMinutes >= 60) {
            newHours += newMinutes / 60;
            newMinutes %= 60;
        }
        if (newHours >= 24) {
            newHours %= 24;
        }

        return new Time(newHours, newMinutes, newSeconds);
    }

    public static void main(String[] args) {
        Time time1 = new Time(); // Initialize to zero
        Time time2 = new Time(4, 30, 15); // Initialize to a fixed value

        System.out.print("Time 1: ");
        time1.displayTime();

        System.out.print("Time 2: ");
        time2.displayTime();

        Time sumTime = time1.addTime(time2);
        System.out.print("Sum of Time 1 and Time 2: ");
        sumTime.displayTime();
    }
}