class Solution {
    public int maxArea(int[] height) {
        
  int n = height.length ;
int maxWater = 0;
for (int i = 0; i < n; i++) {
    for (int j = i + 1; j < n; j++) {

                int minHeight= Math.min(height[i],height[j]);
                int width =j -i;
                int area = minHeight * width;
                maxWater = Math.max(maxWater,area);
            }
        }
        return maxWater;
    }
}
