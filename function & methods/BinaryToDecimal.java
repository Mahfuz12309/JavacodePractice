import java.util.*;
import java.lang.Math;

public class BinaryToDecimal {
    public static double ConBinToDec(int a){
        int bin = a;
        int digit;
        double decimal = 0;
        for(int i=0 ; i<=a; i++){
            if(bin>0){
            digit = bin%10;
            bin = bin/10;
            if(digit==1){
            decimal =decimal+ Math.pow(2, i);
            }
        }
    }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Enter the binary value you want to convert: ");
        a = sc.nextInt();
        System.out.print(ConBinToDec(a));

    }
    
}
