import java.util.Scanner;
class calculator{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		char o,ch;
		int a,b,c;
		int d=0;
		do {
			System.out.println("Enter the first number:-");
			a=sc.nextInt();
			System.out.println("Enter an operator:-");
			o=sc.next().charAt(0);
			System.out.println("Enter the second number:-");
			b=sc.nextInt();
			if (o=='+'){
				d=1;
			}
			else if(o=='-'){	
				d=2;
			}
			else if(o=='/'){	
				d=3;
			}
			else if(o=='*'||o=='x'){
				d=4;	
			}
			switch(d){
				case 1:
				c=a+b;
				System.out.println(a+"+"+b+"="+c);
				break;
				case 2:
				c=a-b;
				System.out.println(a+"-"+b+"="+c);
				break;
				case 3:
				c=a/b;
				System.out.println(a+"/"+b+"="+c);
				break;
				case 4:
				c=a*b;
				System.out.println(a+"x"+b+"="+c);
				break;								
			}
			System.out.println("Do another calculation?(y-yes,n-no)");
			ch=sc.next().charAt(0);
		}
		while (ch!='n' && ch=='y');
	}
}