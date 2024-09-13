package javaCodePractice.BasicSorting;

public class Bubblesort {
    public static void bblsort(int number[]){
        for(int i = 0 ; i<number.length;i++){
            for(int j=0;j<number.length-1-i;j++)
            {
                if(number[j]>number[j+1])
                {
                    int temp = number[j];
                    number [j]= number[j+1];
                    number[j+1] = temp;
                }
            }
        }
        for(int i=0;i<number.length;i++)
        {
            System.out.print(" "+number[i]);
        }

    }
    public static void main(String arg[]){
        int number[]= {5,4,2,1,3};
        bblsort(number);
    }
    
}

