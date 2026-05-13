class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()){
            return "";
        }
        String ans = "";
        for(String s: strs){
            ans+=s;
            ans+="(-_-)";
        }
        return ans;

    }

    public List<String> decode(String temp) {
        if(temp.length()==0){
            return new ArrayList<>();
        }
        List<String> ans = new ArrayList<>();
        int j=0;
        for(int i=0;i<temp.length();i++){
            if(temp.charAt(i)=='('){
                if(i+4 < temp.length() && temp.charAt(i+1)=='-' && temp.charAt(i+2)=='_' && temp.charAt(i+3)=='-' && temp.charAt(i+4)==')'){
                    String s = temp.substring(j,i);
                    j = i+5;
                    ans.add(s);
                }
            }
        }

        return ans;
    }
}
