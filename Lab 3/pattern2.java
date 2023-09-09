import java.util.Scanner;
class pattern2{
	public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("Enter option 1 for Nested for loop");
        System.out.println("Enter option 2 for For-each loop");
        System.out.println("Enter option 3 to exit");
        System.out.print("Enter Option: ");
        int o=sc.nextInt();
        if(o==1)
        {
        int i;int j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            System.out.print(i);  
            System.out.println();
        }
    }
    else if(o==2)
    {
        int n = 5;
        int num = 1;
        for (int i = 1; i <= n * (n + 1) / 2; i++) {
            System.out.print(num + ""); 
            if (i == (num * (num + 1)) / 2) {
                num++;
                System.out.println();
            }
        }
    }
    else if(o==3)
    {
        break;
    }
    else
    {
        System.out.println("Wrong option entered");
    }
}while(1==1);
    }
}