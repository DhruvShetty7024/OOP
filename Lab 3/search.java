import java.util.Scanner;
class search{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
        int a[]=new int[100];
        int i;
        int p;
        p=0;
		System.out.println("Enter number of elements in array:");
		int n=sc.nextInt();
        System.out.println("Enter elements of array:");
        for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
        System.out.println("Enter element to be searched:");
		int x=sc.nextInt();
        System.out.print("Element found at:");
        for(i=0;i<n;i++)
        {
            if(a[i]==x)
            {
                p=i;
                System.out.print(" a["+p+"],");
            }
        }
    }
}
