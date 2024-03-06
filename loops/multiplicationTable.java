import java.util.*;
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        System.out.print("Enter the number you want to find the multiplication table of : ");
        int num = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }
    
}
