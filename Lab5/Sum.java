/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */

//A program to use method overloading
class Complex{
    int a;
    char b[]=new char[10];
    Complex(){
        a=0;
        for(int i=0;i<10;i++){
            b[i]=0;
        }
    }
    int convert(char a[]){
        int b=0;
        for(int i=0;a[i]!='i';i++){
            b=(b*10)+a[i];
        }
        return b;
    }
    void add(int a,int b,char c[]){
        int d=convert(c);
        
    }
}
/*class Method{
    double sum;
    Method(char a[]){
        int b=0;
        for(int i=0;a[i]!='i';i++){
            b=(b*10)+a[i];
        }
    }
    int sum(int a,char b[]){
        
    }
}*/
public class Sum {
    public static void main(String args[]){
        
    }
}
