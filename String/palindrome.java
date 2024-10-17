import java.util.Scanner;

public class palindrome {
    public static void panlindromCheck(String word)
    {
        int length = word.length();
        int count=0;
        for(int i=0;i<length/2;i++)
        {
            
                if(word.charAt(i)!=word.charAt(length-1-i))
                {
                    count++;
                }
        }
        
        if(count>0)
        {
            System.out.println("The word is not a palindrom");
        }
        else{
            System.out.println("The word is a palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to check palindrome: ");
        String word= sc.nextLine();

        panlindromCheck(word);
    }
    
}
