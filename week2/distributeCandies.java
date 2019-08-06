package Week2;

import java.util.HashSet;

class Solution {
    public int distributeCandies(int[] candies) {

        HashSet<Integer> DC = new HashSet<>();

        for(int I: candies){
            DC.add(I);
        }

        if(DC.size() > candies.length/2){

            int extra = DC.size() - candies.length/2;

            return DC.size() - extra;

        }else if(DC.size() < candies.length/2){

            return DC.size();

        }else
            return DC.size();

    }
}