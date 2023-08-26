import java.util.Scanner;
class area_rect
{
public static void main(String args[])
{
int l,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Length");
l=sc.nextInt();
System.out.println("Enter Breadth");
b=sc.nextInt();
System.out.println("The area of the rectangle is " + l*b);
System.out.println("The circumference of the rectangle is " + 2*(l+b));
}
}