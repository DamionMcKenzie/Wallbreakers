package Week2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class MyHashSet {

    List<Integer> Keys;
    int index;

    /** Initialize your data structure here. */
    public MyHashSet() {

        Keys = new ArrayList<>();
        index = 0;

    }

    public void add(int key) {
        Keys.add(key);
        index++;
    }

    public void remove(int key) {

        Iterator itr = Keys.iterator();
        while (itr.hasNext())
        {
            int x = (Integer)itr.next();
            if (x == key)
                itr.remove();
        }


    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {

        for(int i = 0; i < Keys.size(); i++){
            if(Keys.get(i) == key) return true;
        }
        return false;
    }
}

/**
 * Your Week2.MyHashSet object will be instantiated and called as such:
 * Week2.MyHashSet obj = new Week2.MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */