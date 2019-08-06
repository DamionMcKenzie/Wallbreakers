package Week2;

import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();
        set.add(n);

        int sum = sumOfDigitsSquared(n);

        if(sum == 1){
            return true;
        }

        while(sum != 1){

            if(set.contains(sum)){
                return false;
            }

            set.add(sum);
            sum = sumOfDigitsSquared(sum);
        }

        return true;
    }


    public int sumOfDigitsSquared(int I){

        String string = String.valueOf(I);
        char [] C = string.toCharArray();
        int sum = 0;

        for(char c: C){
            sum+=Math.pow((int)c - 48,2);
        }

        return sum;
    }

}