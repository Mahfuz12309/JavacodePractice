import java.util.*;

public class calculateFactorial {
    public static int factorial(int a){
        int fact =1;
        for(int i=a; i>=1;i-- ){
            fact = fact *i;
        }
        return fact;
        
    }
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
    int a;
    System.out.println(" Enter the number to find the factorial : ");
    a = sc.nextInt();
    int fact = factorial(a);
    System.out.println("The factorial of "+a+" is : ");
    for(int i=a; i>1;i-- ){
        System.out.print(i +" x ");
    }System.out.print("x 1 = "+fact);
    }
}
