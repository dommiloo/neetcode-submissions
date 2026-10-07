class Solution {
    public int minEatingSpeed(int[] piles, int h) {
            int maxPile = piles[0];
        for (int i = 1; i < piles.length; i++){
            if(piles[i] > maxPile){
                maxPile = piles[i];
            }
        }

        int left = 1;
        int right = maxPile;

        while(left < right){

            int k = left + (right - left) / 2;

            int hours = 0;

            for (int pile : piles){
                hours += (pile + k - 1) / k;
            }

            if (hours <= h){
                right = k;
            }
            else {
                left = k + 1;
            }


        }

        return left;
        
    }
}
