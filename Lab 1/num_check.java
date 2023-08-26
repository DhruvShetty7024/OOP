import java.util.Scanner;
class num_check
{public static void main(String args[]){
int a[]=new int[10];
int i;int p;int n; int o;
p=0;
n=0;
o=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter Numbers");
for(i=0;i<10;i++)
{a[i]=sc.nextInt();}
for(i=0;i<10;i++)
{
if(a[i]>0)
p++;
else if(a[i]<0)
n++;
else
o++;
}
System.out.println("Number of positive numbers:"+p);
System.out.println("Number of negative numbers:"+n);
System.out.println("Number of zeroes:"+o);
}
}