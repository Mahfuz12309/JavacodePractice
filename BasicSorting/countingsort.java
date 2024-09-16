package javaCodePractice.BasicSorting;

public class countingsort {
    public static void sort(int num[])
    {
        int largest=Integer.MIN_VALUE;
        // finding out the largest in the array
        for(int i=0;i<num.length;i++)
        {
            largest=Math.max(largest, num[i]);
        }
        //counting array is declared +1 is for the reason of that we
        //have to take 0 as a element also thats why we need a extra space in the array

        int count[]= new int[largest+1];
        for(int i=0;i<num.length;i++)
        {
            count[num[i]]++;
        }

        // sorting
        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                num[j]=i;
                j++;
                count[i]--;
            }

        }
        for(int i=0;i<num.length;i++)
        {
            System.out.print(" "+num[i]);
        }
    }
    public static void main(String[] args)
    {
        int num[]={2,1,5,4,7,8,5,0,2,0,1,4,5,0,2,1,5,2,1,45,5};
        sort(num);

    }
}
