import java.util.*;
import java.math.*;

public class findIfPlanidrom {
    public static void checkP(int a){
        int checkNumb=a;
        int newNumb = 0;
        while(checkNumb>0){
            int remainder = (checkNumb%10);
            newNumb = newNumb*10+remainder;
            checkNumb=checkNumb/10;
           
        }
        if(newNumb == a){
            System.out.println("Palindrome!!");
        }
        else{
            System.out.println(" Not Palindrome!!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check if Palindrome or not: ");
        int a = sc.nextInt();
        checkP(a);
    }
    
}
