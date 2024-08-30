import java.util.*;

public class testOne {
//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5
public static void NumberPyramid(int a)
{
    for (int i=1; i<=a;i++)
    {
        for(int k=1; k<=a-i;k++)
        {
            System.out.print(" ");
        }
        for(int j=1; j<=i;j++)
        {
            System.out.print(i+" ");
        }
        System.out.println("");
    }
}
public static void pallindromicPattern(int a){
    for (int i=1; i<=a;i++)
    {
        for(int k=1; k<=a-i;k++)
        {
            System.out.print(" ");
        }
        for(int j=i; j>=1;j--)
        {
            System.out.print(j);
        }
        for(int l=2; l<=i;l++)
        {
            System.out.print(l);
        }
        
        
        System.out.println("");
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        NumberPyramid(n);
        // pallindromicPattern(n);

        
    }
    
}
