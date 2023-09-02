/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
//A program to calculate the total salary of employees
import java.util.Scanner;
class Employee{
    Scanner sc=new Scanner(System.in);
    String empname;
    String city;
    double BS;
    double DA;
    double HRA;
    Employee(){
        BS=0;
        DA=0;
        HRA=0;
    }
    void getdata(){
        System.out.println("Enter the employee name: ");        
        empname=sc.nextLine();
        System.out.println("Enter the city: ");
        city=sc.nextLine();
        System.out.println("Enter the Basic Salary: ");
        BS=sc.nextInt();
        System.out.println("Enter the Dearness Allowance(in %): ");
        DA=sc.nextInt();
        System.out.println("Enter the House Rent Allowance(in %): ");
        HRA=sc.nextInt();
    }
    double calculate(){
        double total;
        total=(BS+(BS*DA/100)+(BS*HRA/100));
        return total;
    }
    void display(double a){
        System.out.println("The total salary of the employee = "+a);
    }
}
public class TotalSalary {
    public static void main(String args[]){
        Employee emp=new Employee();
        emp.getdata();
        double total=emp.calculate();
        emp.display(total);
    }
}
