class Solution {
    public int[] replaceElements(int[] arr) {
        // initial max running backward is -1
        // ^^ we are running backward via reverse iteration
        // new max = max(oldmax, arr[i]);
        int newMax;
        int rightMax = -1;
        for (int i = arr.length-1; i >= 0; i--){
            newMax = Math.max(rightMax, arr[i]);
            arr[i] = rightMax;
            rightMax = newMax;
        }
        return arr;

    }
}