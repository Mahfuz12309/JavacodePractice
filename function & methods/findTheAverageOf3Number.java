import java.util.*;
public class findTheAverageOf3Number {
    public static double average(int a, int b , int c){
        double avg ;

        avg = (double)(a+b+c)/3;
        return avg;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a,b,c;
        System.out.print("A = ");
        a=sc.nextInt();
        System.out.print("b = ");
        b=sc.nextInt();
        System.out.print("c = ");
        c=sc.nextInt();
        
        System.out.println("average of A B C is : "+(double)average(a,b,c));

    }

}
