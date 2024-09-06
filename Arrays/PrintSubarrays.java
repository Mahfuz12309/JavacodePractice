public class PrintSubarrays {
    public static void subarray(int number[]){
        int count=0;
        int sum=0;
        int sum_array[]=new int [50];
        int minsubtotal=Integer.MAX_VALUE,maxsubtotal=0;
        for(int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
                for(int k=i;k<=j;k++)
                {
                    System.out.print(number[k]+" ");
                    sum=sum+number[k];
                }
                sum_array[count]=sum;
                count++;
                System.out.print("\nThe sum of this subarray is: "+sum+"\n");
                sum =0;            }
            System.out.println();
        }
        System.out.println("Total number of subarray is "+count);
        for(int i=0; i<count;i++){
            System.out.print(sum_array[i]+" ");
        }
        for(int i=0; i<count;i++){
            if(maxsubtotal<sum_array[i])
            {
                maxsubtotal =sum_array[i];
            }
            if(minsubtotal>sum_array[i])
            {
                minsubtotal =sum_array[i];
            }
        }
        System.out.print("\nThe maximum total of the sub array is the : "+maxsubtotal);
        System.out.print("\nThe MInimum total of the sub array is the : "+minsubtotal);
    }
    public static void main(String[] args) {
        int number[] = {2, 4, 6 , 8, 10};
        subarray(number);
    }
}
