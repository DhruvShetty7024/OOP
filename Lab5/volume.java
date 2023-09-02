import java.util.Scanner;   
class box{
    double l,b,h;
    Box(double a, double b, double c){
        l=a;
        this.b=b;
        h=c;
    }
    double volume(){
        return l*b*h;
    }
}
public class volume {
    int a,b,c;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length, breadth and height of the box: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Box box=new Box(a,b,c);
        double vol=box.volume();
        System.out.print("The volume of the box = "+vol);
    }
}