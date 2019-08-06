package Week1;

class Solution {
    public void reverseString(char[] n) {

        int L = n.length/2;

        for(int i =0, j = (n.length-1); i < L && j >=L ; i++,j--){
            char temp = n[i];
            n[i] = n[j];
            n[j] = temp;
        }

    }
}