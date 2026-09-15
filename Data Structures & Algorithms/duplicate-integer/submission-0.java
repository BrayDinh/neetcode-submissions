class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean duplicate = false;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++){
            if (set.contains(nums[i])){
               duplicate = true;
            }
            else 
            set.add(nums[i]);
        }
        return duplicate;
    }
}
