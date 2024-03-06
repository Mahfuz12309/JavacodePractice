import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        System.out.print("Enter the number you want to find the factorial: ");
        int num = sc.nextInt();
        int dec_num=num;
        int fact=1;
        while (num>=1) {
            fact = fact*num;
            num = num-1;
            
        }
        System.out.println("the factorial of "+dec_num+" is : "+fact);
    }
    
}
