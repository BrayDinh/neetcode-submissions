class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = "";


        for (int i = str.length()-1; i >= 0; i--){
            reversed += str.charAt(i);
        }

        if (reversed.equals(str)) return true;
        return false;
        
    }
}
