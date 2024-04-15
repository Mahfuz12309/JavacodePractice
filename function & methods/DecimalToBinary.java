import java.util.*;
import java.lang.Math;
public class DecimalToBinary {
    public static void DecToBin(int a){
        int Decimal = a;
        int binary =0;
        int power =0;
        do{
            if(a>=0){
                int bin = a%2;
                a=a/2;
                binary = (int) (binary +bin*(Math.pow(10, power)));
                power++;
            }
        }
        while(a>0);
        System.out.println("");
        System.out.println("The Binary value for the "+Decimal+" is = "+binary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Enter the Decimal value you want to convert: ");
        a = sc.nextInt();
        DecToBin(a);

    }
}
