import java.util.Scanner;
class datatype_conversions{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter an integer number:");
	int i=sc.nextInt();
	System.out.println("Enter a double number:");
	double d=sc.nextDouble();
	System.out.println("Enter a character:");
	char c=sc.next().charAt(0);
	System.out.println("integer to byte:"+(byte)i);
	System.out.println("character to integer:"+(int)c);
	System.out.println("double to byte:"+(byte)d);
	System.out.println("double to integer:"+(int)d);
	}
}