import java.util.ArrayList;

class Student {
    private int registrationNumber;
    private String name;
    private int age;

    public Student(int registrationNumber, String name, int age) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class UGStudent extends Student {
    private int semester;
    private double fees;

    public UGStudent(int registrationNumber, String name, int age, int semester, double fees) {
        super(registrationNumber, name, age);
        this.semester = semester;
        this.fees = fees;
    }

    public void displayUGDetails() {
        System.out.println("UG Student Details:");
        super.displayDetails();
        System.out.println("Semester: " + semester);
        System.out.println("Fees: $" + fees);
    }
}

class PGStudent extends Student {
    private int semester;
    private double fees;

    public PGStudent(int registrationNumber, String name, int age, int semester, double fees) {
        super(registrationNumber, name, age);
        this.semester = semester;
        this.fees = fees;
    }

    public void displayPGDetails() {
        System.out.println("PG Student Details:");
        super.displayDetails();
        System.out.println("Semester: " + semester);
        System.out.println("Fees: $" + fees);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<UGStudent> ugStudents = new ArrayList<>();
        ArrayList<PGStudent> pgStudents = new ArrayList<>();

        
        UGStudent ug1 = new UGStudent(101, "John", 20, 2, 2500.0);
        UGStudent ug2 = new UGStudent(102, "Alice", 19, 3, 2600.0);

        
        PGStudent pg1 = new PGStudent(201, "Bob", 22, 1, 3500.0);
        PGStudent pg2 = new PGStudent(202, "Eve", 23, 2, 3600.0);

        
        ugStudents.add(ug1);
        ugStudents.add(ug2);
        pgStudents.add(pg1);
        pgStudents.add(pg2);

        System.out.println("UG Admissions:");
        for (UGStudent ugStudent : ugStudents) {
            ugStudent.displayUGDetails();
            System.out.println();
        }

        System.out.println("PG Admissions:");
        for (PGStudent pgStudent : pgStudents) {
            pgStudent.displayPGDetails();
            System.out.println();
        }

        System.out.println("Total UG Admissions: " + ugStudents.size());
        System.out.println("Total PG Admissions: " + pgStudents.size());
    }
}