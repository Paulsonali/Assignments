/* Program to check whether number is prime or not*/

import java.util.Scanner;

public class PrimeNo {

    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter Number  ");
          int num=sc.nextInt();
          //int num;
          //num=Integer.parseInt(args[0]);
          int count =0;
          for(int i=1;i<=num;i++){
            if(num%i==0){

            
            count=count+1;
            }
          }
          if(count==2){
            System.out.println("Prime Number");
          }else{
            System.out.println("Not Prime Number");
          }
          sc.close();
    }
    
}
