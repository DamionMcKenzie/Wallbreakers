package Week3;

class Solution {
    public int peakIndexInMountainArray(int[] A) {

        int target = findHighest(A);

        return findPeakIndex(A,target);
    }

    public int findPeakIndex(int [] A, int target){

        for(int i = 0; i < A.length; i++){

            if(A[i] == target){
                return i;
            }
        }
        return -1;
    }


    public int findHighest(int [] arr){


        int h = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > h)
                h = arr[i];
        }

        return h;

    }
}
