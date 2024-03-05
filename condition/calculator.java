import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, ans;
        char choice;
        System.out.print("Enter two number you want to calculate: ");
        a=sc.nextFloat();
        System.out.print("Enter operation sign you want to calculate: ");
        b= sc.nextFloat();
        choice = sc.next().charAt(0);
        switch (choice) {
            //for summation 
            case '+':{
                ans = a+b;
                System.out.println(a+"+"+b+"="+ans);
                break;
            }
            // for substraction
            case '-':{
                ans = a-b;
                System.out.println(a+"-"+b+"="+ans);
                break;
            }
            case '*':{
                ans = a*b;
                System.out.println(a+"*"+b+"="+ans);
                break;
            }
            case '/':{
                ans = a/b;
                System.out.println(a+"/"+b+"="+ans);
                break;
            }
                
                
        
            default:
                break;
        }
        
    }
}
