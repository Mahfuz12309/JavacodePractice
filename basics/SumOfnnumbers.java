import java.math.BigInteger;
import java.util.*;
public class SumOfnnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the range you want to find the sum: ");
        int n= sc.nextInt();
        int i=0,sum=0;
        while (i<=n) {
             sum = sum+i;
             i++;

            
        }
        System.out.println("the sum of the 1 to "+n+" is = "+sum);
        
    }
}
