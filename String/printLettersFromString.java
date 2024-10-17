import java.util.Scanner;

public class printLettersFromString {
    public static void  printchar(String A)
    {
        for(int i=0; i<A.length();i++)
        {
            System.out.println("At index["+i+"] = "+A.charAt(i));
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the String which character you want to find with the index");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        printchar(inputString);
    }
    
}
