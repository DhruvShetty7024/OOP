import java.util.Scanner;
class Time{
    Scanner sc=new Scanner(System.in);
    int hours,mins,secs;
    Time(){
        hours=0;
        mins=0;
        secs=0;
    }
    void input(){
        System.out.print("Enter the hours: ");
        hours=sc.nextInt();
        System.out.print("Enter the minutes: ");
        mins=sc.nextInt();
        System.out.print("Enter the seconds: ");
        secs=sc.nextInt();
    }
    Time(Time obj1,Time obj2){
        secs=obj1.secs+obj2.secs;
        if(secs>60){
            mins=secs/60;
            secs=secs/(mins*60);
        }
        mins=mins+obj1.mins+obj2.mins;
        if(mins>60){
            hours=mins/60;
            mins=mins/(hours*60);
        }
        hours=hours+obj1.hours+obj2.hours;
    }
    void display(){
        System.out.println(hours+" : "+mins+" : "+secs);
    }
}
public class Clock {
    public static void main(String args[]){
        Time t1=new Time();
        Time t2=new Time();
        t1.input();
        t2.input();
        Time t3=new Time(t1,t2);
        t3.display();
    }
}
