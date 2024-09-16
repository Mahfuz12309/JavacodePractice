public class spiralMatrix {
    public static void printSpiral(int matrix[][])
    {
        int colstart=0;
        int rowstat=0;
        int colend=matrix[0].length-1;
        int rowend= matrix.length-1;
        while(rowstat<=rowend && colstart<=colend)
        {
            //top boundry
            for(int j=colstart;j<=colend;j++)
            {
                System.out.print(matrix[rowstat][j]+",");
            }
            //right boundry
            for(int i=rowstat+1;i<=rowend;i++)
            {
                System.out.print(matrix[i][colend]+",");
            }
            //bottom boundray
            for(int j=colend-1;j>=colstart;j--)
            {
                System.out.print(matrix[rowend][j]+",");
            }
            //left boundry
            for(int i=rowend-1;i>=rowstat+1;i--)
            {
                System.out.print(matrix[i][colstart]+",");
            }
            rowstat++;
            rowend--;
            colstart++;
            colend--;

            
        }
    }

    public static void main(String[] args) {
        // int matrix[][]={{1,2,3,4},
        //             {5,6,7,8},
        //             {9,10,11,12},
        //             {13,14,15,16}};
        int matrix[][]={{1,2,3},
                    {5,6,7},
                    {9,10,11}};

    printSpiral(matrix);
        
    }
    

    
}
