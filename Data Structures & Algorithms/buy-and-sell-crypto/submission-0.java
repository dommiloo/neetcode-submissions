class Solution {
    public int maxProfit(int[] prices) {
        int currBuy = 0;
        int currSell = 0;
        int bestSell = 0;
        int bestBuy = prices[0];

        for(int i = 0; i < prices.length; i++){
         currBuy = prices[i]; 

        if(currBuy < bestBuy){
            bestBuy = currBuy;
        }

        currSell = prices[i] - bestBuy;
        
        if(currSell > bestSell){
            bestSell = currSell;
        }

        

        }
        return bestSell;
    }
}
