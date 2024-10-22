public class spiralMatrix {
    public static void printSpiral(int matrix[][])
    {
        int colstart=0;
        int rowstat=0;
        int m=matrix[0].length;
        int n= matrix.length;
        System.out.println(m+""+n);
        int colend=matrix[0].length-1;
        int rowend= matrix.length-1;
        System.out.println("rowstart = "+rowstat+" rowend ="+rowend+" colstart ="+colstart+" rowend= "+rowend);
        
        while(rowstat<=rowend && colstart<=colend)
        {
            //top boundry
            for(int j=colstart;j<=colend;j++)
            {
                System.out.print(matrix[rowstat][j]+",");
                System.out.println("rowstart = "+rowstat+" rowend ="+rowend+" colstart ="+colstart+" rowend= "+rowend);
            }
            //right boundry
            for(int i=rowstat+1;i<=rowend;i++)
            {
                System.out.print(matrix[i][colend]+",");
                System.out.println("rowstart = "+rowstat+" rowend ="+rowend+" colstart ="+colstart+" rowend= "+rowend);
          }
            //bottom boundray
            for(int j=colend-1;j>=colstart;j--)
            {
                System.out.print(matrix[rowend][j]+",");
                System.out.println("rowstart = "+rowstat+" rowend ="+rowend+" colstart ="+colstart+" rowend= "+rowend);
            }
            //left boundry
            for(int i=rowend-1;i>=rowstat+1;i--)
            {
                System.out.print(matrix[i][colstart]+",");
                
                System.out.println("rowstart = "+rowstat+" rowend ="+rowend+" colstart ="+colstart+" rowend= "+rowend);
        
            }
            rowstat++;
            rowend--;
            colstart++;
            colend--;
            

            
        }
    }

    public static void main(String[] args) {
        int matrix[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        
        // {{1,2,3,4},
        //             {5,6,7,8},
        //             {9,10,11,12},
        //             {13,14,15,16}};
        // int matrix[][]={{1,2,3},
        //             {5,6,7},
        //             {9,10,11}};

    printSpiral(matrix);
        
    }
    

    
}
