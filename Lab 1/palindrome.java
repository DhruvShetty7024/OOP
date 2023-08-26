import java.util.Scanner;
class palindrome{
public static void main(String args[]){int a;int n;int rev;int d;int num;
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number");
num=sc.nextInt();
n=num;
rev=0;
while(n!=0)
{d=n%10;
rev=rev*10+d;
n=n/10;}
if(rev==num)
System.out.println("The number is a palindrome.");
else
System.out.println("The number is not a palindrome.");
}}