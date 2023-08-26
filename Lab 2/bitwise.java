import java.util.Scanner;
class bitwise{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		int b=a<<1;
                int c=a>>1;
		System.out.println(a+" x 2 = "+b);
		System.out.println(a+" / 2 = "+c);
	}
}