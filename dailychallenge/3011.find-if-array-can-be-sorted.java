/*
 * @lc app=leetcode id=3011 lang=java
 *
 * [3011] Find if Array Can Be Sorted
 */

// @lc code=start
class Solution {
    public boolean canSortArray(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            boolean flag = false;
            for (int j = 0; j < len - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int setbit = setBitCounts(nums[j]);
                    int setBit2 = setBitCounts(nums[j + 1]);
                    if (setbit == setBit2) {
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                        flag = true;
                    } else {
                        return false;
                    }

                }
            }
            if (!flag)
                return true;
        }
        return true;
    }

    public int setBitCounts(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n = n >> 1;
        }
        return count;
    }
}
// @lc code=end
