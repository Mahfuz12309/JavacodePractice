package javaCodePractice.BasicSorting;

public class insertionsort {
    public static void sort(int num[])
    {
        for(int i=0; i<num.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(num[i]<num[j])
                {
                    int temp=num[j];
                    num[j]=num[i];
                    num[i]=temp;
                }
            }
        }
        for(int i=0;i<num.length;i++)
        {
            System.out.print(" "+num[i]);

        }

    }
    public static void main(String[] args) {
        int number[]= {10,1,3,2,5,18,6,4};
        sort(number);


        
    }
    
}
