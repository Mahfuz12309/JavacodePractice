package javaCodePractice;

public class diagonalsum {
    public static void diagsum(int num[][])
    {
        int row=num.length;
        int col=num[0].length;
        int sum=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i==j)
                {
                    sum=sum+num[i][j];
                }
                else if((i+j)==row-1){
                    sum=sum+num[i][j];
                }
            }
        }
        System.out.println(sum);

    }
    public static void main (String [] arge){
        int num[][]={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        diagsum(num);
    }
    
}
