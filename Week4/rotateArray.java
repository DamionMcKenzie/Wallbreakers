package Week4;

import java.util.*;

class Solution {
    public void rotate(int[] nums, int k) {

        List<Integer> rotation = new ArrayList<>();
        k %= nums.length;

        // sourcing the elements to be rotated
        for(int i = ((nums.length) -1); i >= nums.length - k; i--){
            int a = nums[i];
            rotation.add(a);
        }


        //reverse the elements to be rotated
        Collections.reverse(rotation);

        Queue<Integer> q = new LinkedList<>();


        //adding the elements that were rotated to the queue first
        for(int i = 0; i < rotation.size(); i++){
            q.add(rotation.get(i));
        }

        //adding the elements that were not not rotated to the queue
        for(int i = 0; i < nums.length - k; i++){
            q.add(nums[i]);
        }


        //adding the correct order of elements to nums []
        for(int i = 0; i < nums.length; i++){
            nums[i] = q.remove();
        }

    }
}
