package Week1;

class Solution {
    public String  reverseWords(String s) {
        String [] S = s.split(" ");
        String  reversed = "";
        int i = 0;

        for(String rw: S){

            if(i++ == S.length - 1){

                reversed += reverse(rw);
            }else
                reversed += reverse(rw) + " ";

        }
        return reversed;
    }

    // method to reversw each words in the string
    public String reverse(String  s){
        char [] S = s.toCharArray();
        int L = S.length/2;

        for(int i = 0, j = (S.length-1); i < L && j >= L; i++,j--){
            char temp = S[i];
            S[i] = S[j];
            S[j] = temp;
        }

        String Ss = new String(S);
        return Ss;
    }
}