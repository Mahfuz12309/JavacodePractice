package javaCodePractice.Arrays;

public class rainWater {
    public static int trapwater(int height[]){
        
        int rainWater=0; 
        for(int i=0; i<height.length;i++){
            int maxleft=0;
        int maxright=0;
        int waterlevel=0;
            for(int j=i;j<height.length;j++)
            {
                if(maxright<height[j])
                {
                    maxright=height[j];
                }
            }
            for(int k=i;k>=0;k--)
            {if(maxleft<=height[k])
                {
                    maxleft=height[k];
                }

            }
            int dif=Math.min(maxright, maxleft);
            rainWater= rainWater+(dif-height[i]);
            
        }
        
        return rainWater;

        // let's try with helping array
        // int n=height.length;
        // int leftmax[]=new int[n];
        // leftmax[0]=height[0];
        // for(int i=1;i<n;i++){
        //     leftmax[i]=Math.max(height[i], leftmax[i-1]);
        // }

        // int rightmax[]= new int[n];
        // rightmax[n-1]=height[n-1];

        // for(int i=n-2;i>=0;i--)
        //     rightmax[i]=Math.max(height[i], rightmax[i+1]);

        //     int trapwater=0;
        // for(int i=0;i<n;i++)
        // {
        //     int waterlevel= Math.min(leftmax[i], rightmax[i]);
        //     trapwater+=waterlevel-height[i];
            
        // }
        // return trapwater;
        
        
}

    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        // // // int height[]={ 4,2,0,3,2,5};
        // int height[]={2,0,2};
    System.out.println(trapwater(height));
    }
}
