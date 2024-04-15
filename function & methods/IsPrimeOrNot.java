import java.util.*;
import java.lang.Math; 
public class IsPrimeOrNot {

public static boolean prime(int a){
    
    for(int i =2  ; i<= Math.sqrt(a);i++){
        if(a%2 ==0){
            return false;
        }

    }
    return true;
}
public static void main(String [] arg){
    Scanner sc = new Scanner (System.in);
    int n;
    System.out.println("Enter the number to check: ");
    n = sc.nextInt();
    if(prime(n)){
        System.out.println(n+" Is a Prime Number!!");
    }
else{
    System.out.println(n+" Is not a Prime Number!!");
}

}
}
