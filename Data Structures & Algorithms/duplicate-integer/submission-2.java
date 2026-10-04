class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        boolean duplicate = false;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                duplicate = true;
            }
            else {
                map.put(nums[i], i);
            }
        }
        return duplicate;
    }
}
