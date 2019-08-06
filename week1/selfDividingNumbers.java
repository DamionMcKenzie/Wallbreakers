package Week1;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> sdn = new ArrayList();

        for(int l = left; l <=right; l++){

            if(selfdividing(l))
                sdn.add(l);
        }
        return sdn;
    }

    public boolean selfdividing(int L){
        for( char n: String.valueOf(L).toCharArray()){
            if(n == '0' || L % (Character.getNumericValue(n)) != 0) return false;
        }
        return true;
    }
}