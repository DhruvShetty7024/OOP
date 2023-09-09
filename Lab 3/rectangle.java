import java.util.Scanner;
class rectangle{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
        int o;
        do
        {
        System.out.println("Enter 1 for finding circumference, Enter 2 for finding area, Enter 3 for exit");
        o=sc.nextInt();
        if(o==1)
        {
        System.out.println("Enter length:");
		int l=sc.nextInt();
        System.out.println("Enter breadth:");
		int b=sc.nextInt();
        System.out.println("Circumference is:"+2*(l+b));
        }
        else if(o==2)
        {System.out.println("Enter length:");
		int l=sc.nextInt();
        System.out.println("Enter breadth:");
		int b=sc.nextInt();
        System.out.println("Area is:"+(l*b));
        }
        }while(o!=3);
    }
}

        

        

