class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean duplicate = false;
        HashMap<Integer, Integer> set = new HashMap<>();

        for (int i = 0; i < nums.length; i++){

            if (!set.containsKey(nums[i])){
                set.put(nums[i], i);
            }
            else {
                duplicate = true;
            }

        }
        return duplicate;
    }
}
