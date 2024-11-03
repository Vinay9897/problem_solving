/*
 * @lc app=leetcode id=796 lang=java
 *
 * [796] Rotate String
 */

// @lc code=start
class Solution {
    public boolean rotateString(String s, String goal) {
        int slen = s.length();
        int sgoal = goal.length();
        if (slen != sgoal)
            return false;
        String s2 = s + s;
        if (s2.contains(goal))
            return true;
        return false;
    }
}
// @lc code=end
