/* Print all prime numbers between two given numbers.*/
import java.util.Scanner;

public class PrimeNoBtwTwoNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number  ");
        int num1=sc.nextInt();
        System.out.println("Enter Second Number  ");
        int num2=sc.nextInt();
      
        int count=0;
        for(int i=num1;i<=num2;i++){//i=12
            for(int j=1;j<=i;j++){
                if(i%j==0){//12%1=0;12%2=0;12%3=0;12%4=0;12%6=0;12%12=0 s0 count =6 but 
                                //13%1=0;13%13=0 so count =0

                    count=count+1;
                }
            } 
            if(count==2){
                System.out.println(i);
            }else{
                count=0;
            }

        }
       
        
    }
    
}
