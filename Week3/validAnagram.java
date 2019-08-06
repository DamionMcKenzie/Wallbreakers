package Week3;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] perm = new int[128];

        for(int i = 0; i < s.length(); i++){
            int value = Character.getNumericValue(s.charAt(i));
            perm[value]++;
        }

        for(int i = 0; i < t.length(); i++){
            int value = Character.getNumericValue(t.charAt(i));
            perm[value]--;

            if(perm[value] == -1) return false;
        }
        return true;
    }
}
