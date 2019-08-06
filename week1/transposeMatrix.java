package Week1;

class Solution {
    public int[][] transpose(int[][] A) {

        //new array to hold the transposed values
        int [][] transposed = new int[A[0].length][A.length];


        for(int i = 0; i < A[0].length; i++){
            for(int j =0; j < A.length; j++){
                //traversing each column and storing it in the transposes array
                transposed[i][j] = A[j][i];
            }
        }
        return transposed;
    }
}