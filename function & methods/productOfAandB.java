import java.util.*;
public class productOfAandB {
   public static int multiply(int a , int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] arg){
        Scanner sc =  new Scanner (System.in);
        int a,b;
        a= sc.nextInt();
        b=sc.nextInt();
        int prod = multiply(a, b);
        System.out.println("a * b = "+prod);

    }
    
}
