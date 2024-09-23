package javaCodePractice;

import java.util.*;
public class twoSArray {
    public static void serach(int mat[][],int number){
        for(int i=0; i<mat.length;i++)
        {
            for(int j=0; j<mat[0].length;j++)
        {
           if(number==mat[i][j])
           {
            System.out.println("Found! The key is avaialble in the ["+i+","+j+"]");
           }
        }
        
        }
    }
    public static void main(String[] args) {
        int matrix[][]= new int[3][3];// creation of 3*3 matrix in 2d array
        int n=3; int m=3;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n;i++)
        {
            for(int j=0; j<m;j++)
        {
            matrix[i][j]=sc.nextInt();
        }
        }
        for(int i=0; i<n;i++)
        {
            for(int j=0; j<m;j++)
        {
           System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
        }
        int key=sc.nextInt();
        serach(matrix, key);
    }
    
}
