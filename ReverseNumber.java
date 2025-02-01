/*Program to reverse a given number*/

import java.util.Scanner;

public class ReverseNumber {

    
    public static void main(String[] args){

       
       //get inpiut from command prompt
        int num;
        num=Integer.parseInt(args[0]);
        int rev=0;
       
        while(num>0) {
            int rem=num%10;//3//2//1
            rev=rev*10+rem;//0*10+3=3//3*10+2=32//32*10+1=321
            num=num/10;//12//1
            
            
        }
        System.out.println(rev);
        System.out.println("_______________________________________");

        //using scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number   ");
        int num1= sc.nextInt();
        int rev1=0;
        while(num1>0) {
            int rem=num1%10;//3//2//1
            rev1=rev1*10+rem;//0*10+3=3//3*10+2=32//32*10+1=321
            num1=num1/10;//12//1
            
            
        }
        System.out.println(rev1);
        sc.close();



    }
}