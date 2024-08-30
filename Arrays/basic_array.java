import java.util.Scanner;

public class basic_array {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a;
        a= sc.nextInt();
        int N[]= new int[10];
        if(a<50){
        for(int i=0;i<10;i++){
            System.err.println("N["+i+"] = "+a);
            a= a*2;
        }
    }

        
}
}
