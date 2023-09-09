import java.util.Scanner;

class Bank {
    double getRateOfInterest() {
        return 0.0; 
    }

    double calculateInterest(double amount) {
        double rate = getRateOfInterest();
        return (amount * rate) / 100.0;
    }
}

class SBI extends Bank {
    
    public double getRateOfInterest() {
        return 8.0;
    }
}

class ICICI extends Bank {
    
    double getRateOfInterest() {
        return 7.0;
    }
}

class AXIS extends Bank {
    
    double getRateOfInterest() {
        return 9.0;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount: ");
        double amount = scanner.nextDouble();

        Bank sbiBank = new SBI();
        Bank iciciBank = new ICICI();
        Bank axisBank = new AXIS();

        double sbiInterest = sbiBank.calculateInterest(amount);
        double iciciInterest = iciciBank.calculateInterest(amount);
        double axisInterest = axisBank.calculateInterest(amount);

        System.out.println("Interest earned in SBI Bank: $" + sbiInterest);
        System.out.println("Interest earned in ICICI Bank: $" + iciciInterest);
        System.out.println("Interest earned in AXIS Bank: $" + axisInterest);

        scanner.close();
    }
}