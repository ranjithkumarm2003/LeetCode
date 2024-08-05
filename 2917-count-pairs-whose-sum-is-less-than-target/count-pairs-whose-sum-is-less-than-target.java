import java.util.List;
import java.util.Collections;

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        // First, sort the list
        Collections.sort(nums);
        
        int count = 0;
        int left = 0;
        int right = nums.size() - 1;
        
        while (left < right) {
            int sum = nums.get(left) + nums.get(right);
            
            if (sum < target) {
                // All pairs with nums.get(left) and elements between left and right will satisfy the condition
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }
        
        return count;
    }
}
