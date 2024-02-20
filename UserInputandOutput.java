import java.util.*;
public class UserInputandOutput {
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        int a, b, sum, product;
        float radius, area;

        ///finding the summation in java
        System.err.print("Enter the value of A:");
       a=sc.nextInt();
       System.err.print("Enter the value of B:");
       b=sc.nextInt();
       sum=a+b;
       ///finding the summation in java
       System.err.println("The sum of the A and B is: "+sum);

       product=a*b;
       System.out.println("The product of the A and B is: "+product);

       ///finding the area of the cirle using the java

       System.out.print("Enter the radius of the circle to find out the area : ");
       radius= sc.nextFloat();
       area=  3.1416f*radius*radius;

       System.out.println("The area of the circle: "+area);
    }
    
}
