class Solution {
    public int fun(Map<Character, Integer> mp, char curr, char prev, int ans){
        if((curr == 'V' && prev == 'I') || (curr == 'X' && prev == 'I') || (curr == 'L' && prev == 'X') || (curr == 'C' && prev == 'X') || (curr == 'D' && prev == 'C') || (curr == 'M' && prev == 'C')){
            ans = ans + mp.get(curr)- (2*(mp.get(prev)));
        }else{
            ans = ans + mp.get(curr);
        }

        return ans;

    }


    public int romanToInt(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);

        char prev = s.charAt(0);
        int ans = mp.get(prev);
        for(int i =1;i<s.length();i++){
            ans = fun(mp, s.charAt(i), prev, ans);
            prev = s.charAt(i);
        }

        return ans;
    }
}