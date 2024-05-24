import java.util.*;
public class StarRombus {
    public static void printRombus(int n)
    {
        for(int i=1;i<=n; i++)
        {
            for(int k=1;k<=(n-i);k++)
            {
                System.out.print(" ");
            }
            for (int j=1; j<=n; j++)
            {
                if(i==1||j==1||i==n||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        printRombus(n);
        
    }
    
}
