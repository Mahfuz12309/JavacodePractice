package javaCodePractice;

public class searchinsorted {
    public static void staircasesrch(int num[][],int key)
    {
        int row=0,col=num[0].length-1;
        while(row<num.length && col>=0)
        {
            if(key==num[row][col])
            {
                System.out.println("Found! key at "+row+","+col);
                break;
            }  
            else if(key < num[row][col])  
            {
                col--;
            }  
            else
            {
                row++;
            }     
        }

    }
    public static void main(String[] args) {
        int num[][]={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        int key=8;
        staircasesrch(num, key);

        
    }
    
}
