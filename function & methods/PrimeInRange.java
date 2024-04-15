import java.util.*;

public class PrimeInRange {
    public static boolean prime(int a){ 
    
        for(int i =2  ; i<= Math.sqrt(a);i++){
            if(a%2 ==0){
                return false;
                
            }
    
        }
        return true;
    }

    public static void findPrimeInRange (int a, int b){
        for(int i= a ; i<= b ; i++){
            if(prime(i))
            {
                System.out.print(i+" ");
            }

    }
}

    public static void main(String [] arg){
        Scanner sc = new Scanner (System.in);
        int low, high;
        System.out.println("Enter the Lower value of the range : ");
        low = sc.nextInt();
        System.out.println("Enter the Higher value of the range : ");
        high = sc.nextInt();
        findPrimeInRange(low, high);
    
    
}
}