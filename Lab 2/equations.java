import java.util.Scanner;
class equations{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a:");
	int a=sc.nextInt();
	System.out.println("Enter b:");
    int b=sc.nextInt();
    int c;
    c=((a << 2) + (b >> 2));
    System.out.println(c); 
    boolean d;
    d=(b>0);
    System.out.println(d); 
    float e;
    e= (a + b * 100) / 10;
    System.out.println(e); 
    int f;
    f=(a&b);
    System.out.println(f); 
    }
}

