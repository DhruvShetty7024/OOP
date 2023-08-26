import java.util.Scanner;
class table
{public static void main(String args[])
{
int a;int i;int pro;
pro=1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number");
a=sc.nextInt();
for(i = 0; i<11; i++)
{
pro=a*i;
System.out.println(a+ "*" +i+ "=" +pro);
}

}
}