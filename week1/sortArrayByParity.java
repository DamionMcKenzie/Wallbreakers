package Week1;

class Solution {
    public int[] sortArrayByParity(int[] A) {

        //new array created to hold sorted values
        int [] sorted = new int [A.length];
        //index for the sorted array
        int index = 0;

        //for loop to find even numbers
        for(int i = 0; i < A.length ; i++){

            if(A[i] % 2 == 0){

                sorted[index] = A[i];
                index++;
            }
        }

        //for loop to find odd numbers
        for(int i = 0; i < A.length ; i++){

            if(A[i] % 2 != 0){

                sorted[index] = A[i];
                index++;
            }

        }
        return sorted;
    }
}