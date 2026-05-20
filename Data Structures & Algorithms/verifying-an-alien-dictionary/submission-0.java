class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Character> mp = new HashMap<>();
        for(int i=0;i<order.length();i++){
            mp.put(order.charAt(i), (char)(i+'a'));
        }
        String temp = "";
        String sec = "";
        for(int k = 0;k<words.length;k++){
            sec = "";
            String s = words[k];
            for(int i=0;i<s.length();i++){
                sec = sec + mp.get(s.charAt(i));
            }

            if((temp.compareTo(sec)) > 0){
                return false;
            }

            temp = sec;
        }

        return true;
    }
}