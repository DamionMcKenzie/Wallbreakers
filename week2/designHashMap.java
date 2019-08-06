package Week2;

class MyHashMap {
    int[] keys;
    int[] values;

    /** Initialize your data structure here. */
    public MyHashMap() {
        keys = new int[100000];
        values = new int[100000];
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        keys[key] = 1;
        values[key] = value;
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        if (keys[key] <= 0) {
            return -1;
        }
        return values[key];
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        keys[key] = -1;
        values[key] = -1;
    }
}