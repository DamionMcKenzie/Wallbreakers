package Week2;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numJewelsInStones(String J, String S) {

        int count = 0;
        Set<Character> stringSet = new HashSet<>();


        for(int i = 0; i < J.length(); i++){
            stringSet.add(J.charAt(i));
        }

        for(int j = 0; j < S.length(); j++){
            if(stringSet.contains(S.charAt(j))){
                count++;
            }
        }

        return count;
    }
}