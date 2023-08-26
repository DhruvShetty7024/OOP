import java.util.Scanner;
class armstrong{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
        int n,sum,d;
        sum=0;
        n=a;
        while(n!=0)
        {
            d=n%10;
            sum=sum+(d*d*d);
            n=n/10;
        }
        if(sum==a)
        System.out.println("It is a armstrong number");
        else
        System.out.println("It is not a armstrong number");
    }
}

