import java.util.Scanner;
class factorial
{public static void main(String args[]){
int a;int i;int fact;
fact=1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number");
a=sc.nextInt();
for(i= 1;i<=a;i++)
{
 fact*=i; 
}
System.out.println(fact);
}
}