import java.util.*;

public class findBionomilaCoefficient {
    public static int factorial(int a){
        int fact = 1;
        for(int i=a; i>=1; i--){
            fact = fact *i;
        }
        return fact;
    }
    public static float binom(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nr = factorial(n-r);

        float binom = (fact_n)/((fact_r)*fact_nr);
        return binom;

    }

    public static void main(String[] args) {
        int n,r;
        Scanner sc = new Scanner (System.in);
        n= sc.nextInt();
        r= sc.nextInt();
        
        System.out.println("The binomial coefficient for "+n+ "C"+r+" = "+binom(n,r));

    }
    
}
