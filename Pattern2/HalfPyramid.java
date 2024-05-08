import java.util.*;
public class HalfPyramid {
    public static void invertpyramid(int n){
        for (int i=1; i<=n; i++){
            for(int j=1;j<=n-i; j++)
            {
                
                System.out.print(" ");
            }
            for(int j=1;j<=i; j++)
            {
                
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        invertpyramid(row);

    }
    
}
