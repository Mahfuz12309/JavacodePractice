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
        System.out.println(rainWater);