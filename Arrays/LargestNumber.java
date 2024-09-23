
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int a[] = new int[length];
        for(int i=0;i<length; i++)
        {
            a[i]= sc.nextInt();
        }
        for (int i=0;i<length;i++)
        {
            System.out.print(a[i]+" ");
            
        }
        int largest =Integer.MIN_VALUE;
        for(int i=0;i<length; i++)
        {
            if(a[i]> largest){
                largest = a[i];
            }
        }
        System.out.println("\n"+"The largest number in the array is "+largest);


        
    }
    
}
