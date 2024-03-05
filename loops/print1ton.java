import java.util.*;
public class print1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int i=1;
        System.out.println("Enter the range you want to find");
        n = sc.nextInt();
        while(i<=n){
            System.out.print(i+ " ");
            i++;
        }
        System.out.println();
    }
}
