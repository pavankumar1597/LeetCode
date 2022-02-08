public class Best_Time_to_Buy_and_Sell_Stock_II

{


    public static void main(String[] args) {

        int[] ff = {7,1,5,3,6,4};
        System.out.println(maxProfit(ff));
    }


    public static int maxProfit(int[] prices) {

int profit =0;

        for(int i=0,j=1  ;j<prices.length;j++,i++)
        {
            if(prices[i]<prices[j]){
                profit += prices[j]-prices[i];
            }
        }
return profit ;
    }
}
