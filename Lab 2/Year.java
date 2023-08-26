import java.util.Scanner;
class Year{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		int y;
		System.out.println("Enter a year: ");
		y=sc.nextInt();
		if(y%4==0){
			if(y%100!=0){
				System.out.print("Leap Year");
			}
			else{
				if(y%400==0){
					System.out.print("Leap Year");
				}
				else{
					System.out.print("Common Year");
				}
			}
		}
		else{
			System.out.print("Common Year");	
		}
	}
}