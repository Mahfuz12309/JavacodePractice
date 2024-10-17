import java.util.*;

public class Strings {
    public static void main(String[] args) {
        char arr[]={'a','b','c'};
        String str = new String("abc");
        String name;
        Scanner sc= new Scanner(System.in);
        name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());
        //string concatenation
        String firstname="Mohammad ";
        String lastname= "Mahfuzur Rahman";
        String fullname = firstname + lastname;
        System.out.println(fullname);
        System.out.println(fullname.charAt(10));
    }
    
    
}
