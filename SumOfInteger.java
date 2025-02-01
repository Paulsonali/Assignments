/* Calculate sum of first 20 integers. */
import java.util.Scanner;



public class SumOfInteger {
    public static void main(String[] args) {
        
       //using scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number   ");
        int num= sc.nextInt();  
        int total=0;
        for(int i=1;i<=num;i++){
            total=total+i;

        }
        System.out.println("Sum Of Given Integer " +total);
        sc.close();

    }
    
}
