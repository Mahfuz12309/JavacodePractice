import java.util.*;
public class OddorEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Enter the number to find out the Odd or Even: ");
        a = sc.nextInt();
        if(a%2==0)
        {
            System.out.println("even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
