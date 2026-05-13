class Solution {

    public static boolean checkPart(int i, int j, String s){
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;

        boolean check = false;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                boolean say1 = checkPart(i+1,j,s);
                boolean say2 = checkPart(i,j-1,s);

                if(say2 == false && say1 == false){
                    return false;
                }

                break;
            }

            i++;
            j--;
        }

        return true;
        
    }
}