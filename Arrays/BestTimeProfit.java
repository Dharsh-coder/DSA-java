public class BestTimeProfit {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxprofit = 0;
        int minprice = prices[0];
        for(int i=0;i<n;i++){
           if(prices[i]<minprice){
            minprice=prices[i];
           }
           else{
           int profit=prices[i]-minprice;
            if(maxprofit<profit){
                maxprofit=profit;
            }
           }    
        }
        return maxprofit;
    }
}
