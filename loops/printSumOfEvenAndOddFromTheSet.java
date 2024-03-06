import java.util.*;
public class printSumOfEvenAndOddFromTheSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter How many number you want to give as input : ");
        int set = sc.nextInt();
        int oddtotal=0,eventotal=0;
        System.out.print("Enter total "+set+" number seperated with space: ");
        for(int i=0; i<set; i++){
            
            int number = sc.nextInt();
            if(number%2==0){
                eventotal  =  eventotal+number;
            }
            else
            {
                oddtotal = oddtotal+number;
            }
        }
        System.out.println("The sum of even integers is : "+eventotal);
        System.out.println("The sum of odd integers is : "+oddtotal);
    }
}
