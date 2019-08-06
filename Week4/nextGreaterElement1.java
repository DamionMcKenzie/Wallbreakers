package Week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        List<Integer> list = new ArrayList<>();


        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < nums1.length; i++){
            stack.push(nums1[i]);
        }


        while(!stack.isEmpty()){

            int num = stack.pop();
            int match = 10000;
            int nge = -1;
            boolean foundNGE = false;

            for(int i = 0; i < nums2.length; i++){

                if(nums2[i] == num){
                    match = nums2[i];
                }

                if(nums2[i] > match && !foundNGE){
                    nge = nums2[i];
                    foundNGE = true;
                }

                if(i == nums2.length -1){
                    list.add(nge);
                }
            }

        }

        int[] returned = new int[list.size()];


        for( int l = 0, k = list.size() - 1; l < list.size() && k >= 0; l++, k--){

            returned[l] = list.get(k);
        }

        return returned;

    }
}
