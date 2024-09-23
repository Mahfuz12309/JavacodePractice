import java.util.*;
public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;
        System.out.println("Enter the Array size: ");
        length=sc.nextInt();
        int number []= new int[length];
        for (int i=0;i<length;i++)
        {
            number[i]=sc.nextInt();

        }
        for (int i=0;i<length;i++)
        {
            System.out.print(number[i]+" ");
            
        }
        System.out.println();
        System.out.print("Enter the key you want to search: ");
        int element;
        int flag=-1;
        element = sc.nextInt();
        for (int i=0;i<length;i++)
        {
            if(element == number[i])
            {
                flag =i;
                break;
            }
            
        }
        if(flag>=0){
            System.out.println("The key has been found and the index of the element is : "+flag);
        }


    }
    
}
