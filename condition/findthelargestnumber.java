
import java.util.Scanner;

public class findthelargestnumber {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        double a ,b ,c;
        System.out.print("Enter the value of A B and C :");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        if(a>b){
            if(a>c)
            {
                a=a;
            }
            else{
                a=c;
            }
        }
        else{
            if(b>c)
            {
                System.out.println("B is the largest number which is:"+b);
            }
            else{
                System.out.println("C is the greatest number which is: "+c);
            }
        }
    }
    
}
