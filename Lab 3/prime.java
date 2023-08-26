import java.util.Scanner;
class prime{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m:");
		int m=sc.nextInt();
        System.out.println("Enter n:");
		int n=sc.nextInt();
        int i;int c;int j;
        c=0;
        for(i=m;i<=n;i++)
        { c=0;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                c++;
            }
            if(c==0)
            System.out.print(i+" ");
        }
    }
}
