class Solution {
    public int maxProfit(int[] prices) {
// least so far - lsf
// overall profit - op
// profit if sold today - pist
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;

        for(int i = 0; i<prices.length; i++){
            if(prices[i]< lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
            
        return op;
    }
}


