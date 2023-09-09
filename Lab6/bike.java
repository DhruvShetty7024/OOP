class Bike {
    int speedLimit = 60;

    void run() {
        System.out.println("Bike speed limit: " + speedLimit + " km/h");
    }
}

class Splendar extends Bike {
    int speedLimit = 80;

    @Override
    void run() {
        System.out.println("Splendar speed limit: " + speedLimit + " km/h");
    }
}

class Main2 {
    public static void main(String[] args) {
        Bike bike = new Splendar(); // Upcasting
        bike.run(); // Calls the overridden method in Splendar class
    }
}