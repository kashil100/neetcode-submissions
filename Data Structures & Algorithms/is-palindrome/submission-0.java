class Solution {
    public boolean isPalindrome(String s) {

        String temp="";
        for(int i = 0;i<s.length();i++){
            if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='0' && s.charAt(i)<='9')){
                temp = temp+s.charAt(i);
            }
        }
        s = temp.toLowerCase();
        //s.toLowerCase();
        System.out.println(s);
        int j = s.length()-1;
        int i = 0;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
