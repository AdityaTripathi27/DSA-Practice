class Solution {
    public int maxArea(int[] height) {
       int i=0;
       int j=height.length-1;
       int max=0;
       while(i<j)
       {
            int m=Math.min(height[i],height[j]);
            int h=j-i;
            int curr=m*h;
            if(height[i]<height[j])
            {
                i++;
            }else
            {
                j--;
            }
            max=Math.max(max,curr);
       }
       return max;
    }
}