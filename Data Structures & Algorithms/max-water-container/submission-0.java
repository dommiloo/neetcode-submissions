class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1; 
        int height = 1;
        int width = 0;
        int currWater = 0;
        int bestWater = 0;

        while (left < right){
        height = Math.min(heights[left], heights[right]);
        width = right - left;

        currWater = height * width;

        if(currWater > bestWater){
            bestWater = currWater;
            currWater = 0; 
        }

        if (heights[left] < heights[right]) {
                left++;
        } else {
                right--;
                }


        }

        return bestWater;
        
    }
}
