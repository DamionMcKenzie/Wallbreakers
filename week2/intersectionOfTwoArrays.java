package Week2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {


        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        List<Integer> ilist = new ArrayList<>();



        for(int i: nums1){
            set1.add(i);
        }

        for(int i: nums2){
            set2.add(i);
        }

        set1.forEach(element -> {

            if(set2.contains(element)){
                ilist.add(element);
            }
        });


        int [] intersect = new int [ilist.size()];

        for(int i = 0; i < ilist.size(); i++){
            intersect[i] = ilist.get(i);
        }

        return intersect;
    }
}



