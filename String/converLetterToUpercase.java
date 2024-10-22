import java.util.*;

public class converLetterToUpercase {
    public static String upercase(String str)
    {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        int n = str.length();
        for(int i =1; i<n;i++)
        {
            if(str.charAt(i-1)==' ' && i<str.length()-1){
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        System.out.println(upercase(str));
    }
}
