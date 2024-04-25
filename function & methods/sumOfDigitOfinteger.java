import java.util.*;

public class sumOfDigitOfinteger {
    public static  int sumof(int a)
    {
        int sum= 0;
        while(a>0){
            int remainder = (a%10);
            sum = sum+remainder;
            a=a/10;
           
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("The sum of the digits of the "+number+" is: "+sumof(number));        
    }
    
}
