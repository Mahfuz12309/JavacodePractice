package javaCodePractice.Arrays;

public class BuySellStocks {
    public static int buysellstocks(int price[]){
        int n= price.length;
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        
        for(int i=0;i<n;i++)
        {
            int sellprice=price[i];
            if(buyprice<sellprice)
            {
                int profit=sellprice-buyprice;
                maxprofit= Math.max(maxprofit, profit);
            }
            else
            {
                buyprice = sellprice;
            }
        }
        return maxprofit;
    }
    public static void main(String[] arg){
        int price[]={7,1,5,3,6,4};
        
        System.out.println("the maximum profit is :"+buysellstocks(price));
    }
    
}
