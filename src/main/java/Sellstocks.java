public class Sellstocks {




        public int maxProfit(int[] prices) {



            int maxprofit = 0 ;
            int min = prices[0];

            for (int i=1;i<prices.length; i++){
                maxprofit = Math.max(maxprofit,  prices[i]-min);
                min = Math.min(prices[i],min);
            }

            return maxprofit ;


    }
}
