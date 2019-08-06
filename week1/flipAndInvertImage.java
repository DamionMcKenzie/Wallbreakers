package Week1;

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {

        int [][] FAII = new int [A.length][A[0].length];


        for(int i = 0; i < A.length; i++){
            int jIndex = 0;
            for(int j = A.length - 1; j >= 0; j--){

                FAII[i][jIndex ] = A[i][j];

                if(FAII[i][jIndex] == 0){
                    FAII[i][jIndex] = 1;
                }else if(FAII[i][jIndex] == 1){
                    FAII[i][jIndex] = 0 ;
                }

                jIndex++;

            }
        }

        return FAII;
    }
}