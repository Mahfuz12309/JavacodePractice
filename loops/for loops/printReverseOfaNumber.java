import java.util.Scanner;

public class printReverseOfaNumber {
    
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse: ");
        int number= sc.nextInt();
        for(int i=0;i<number; i++)
        {
            int lastdigit = number%10;
            System.out.print(lastdigit);
            number = number/10;
        }
        // System.out.print(number);
    }
}
