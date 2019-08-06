package Week3;

class Solution {
    public boolean isSubsequence(String s, String t) {



        char [] S = s.toCharArray();
        char [] T = t.toCharArray();

        StringBuilder pattern = new StringBuilder();

        int sInt = 0, tInt =0;

        while(sInt < S.length && tInt < T.length){

            if(S[sInt] == T[tInt]){
                pattern.append(S[sInt]);
                sInt++;
                tInt++;
            }else
                tInt++;

        }
        return pattern.toString().equals(s);
    }
}
