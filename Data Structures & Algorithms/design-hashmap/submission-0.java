class MyHashMap {
    private int[] map;
    private boolean[] check;
    public MyHashMap() {
        map = new int[1000001];
        check = new boolean[1000001];
        
    }
    
    public void put(int key, int value) {
        map[key] = value;
        check[key] = true;
    }
    
    public int get(int key) {
        if(check[key] == false){
            return -1;
        }

        return map[key];
    }
    
    public void remove(int key) {
        check[key] = false;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */