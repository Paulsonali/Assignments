/*1. Program to print a table of any number. */
import java.util.Scanner;

public class Table {
    //using Function
    public static void tableCreation(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
    
        }
     }

    public static void main(String[] args){
        System.out.println("hello.....");
        //get input from coomant prompt
        int m;
        m=Integer.parseInt(args[0]);
        for(int i=1;i<=10;i++){
            
            System.out.println(m*i);
        }
       
        //using for loop
        int n=7;
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
        //using while loop
        int range=8;
        int i=1;
        while(i<=10){
            System.out.println(range*i);
            i++;
        }

        tableCreation(9);
        //using scanner class
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number===");
        int num=sc.nextInt();
        for(int j=1;j<=10;j++){
            System.out.println(num*j);
        } 
        sc.close();

    }
}
