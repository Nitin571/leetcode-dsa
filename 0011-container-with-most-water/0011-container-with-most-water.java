class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int i = 0;
        int j = height.length-1;

        while(i< j){
            int ht = Math.min(height[i],height[j]);
            area = Math.max(area,ht * (j-i));

            if(height[i] < height[j]){
                i++;
            } else{
                j--;
            }
        }
        return area;
    }
}