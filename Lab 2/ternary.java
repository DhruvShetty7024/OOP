import java.util.Scanner;
class ternary{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a:");
	int a=sc.nextInt();
	System.out.println("Enter b:");
	int b=sc.nextInt();
    System.out.println("Enter c:");
	int c=sc.nextInt();
    int l;
    l=(a>b)?a:b;
    l=(c>l)?c:l;
    System.out.print("Largest number is:");
    System.out.println(l);
    }
}