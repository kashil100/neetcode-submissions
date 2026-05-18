class Solution {

    public String encode(List<String> strs) {
        String ans = "";
        for(String s: strs){
            for(int i =0;i<s.length();i++){
                int x = (int)(s.charAt(i));
                char c = (char)(x+1);
                ans = ans + c;
            }

            ans = ans + "!(- _ -)!";
        }

        return ans;


    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        String temp = "!(- _ -)!";
        String s = "";
        
        for(int i = 0;i<str.length();i++){
            if((i+temp.length()) <= str.length() && str.substring(i,i+temp.length()).equals(temp)){
                ans.add(s);
                s = "";
                i+=(temp.length()-1);
                continue;
            }

            int x = (int)(str.charAt(i));
            char c = (char)(x-1);
            s = s+c;
        }

        return ans;
    }
}
