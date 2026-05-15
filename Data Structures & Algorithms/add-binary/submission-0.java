class Solution {
    public String addBinary(String a, String b) {
        if(a.length() < b.length()){
            String s = b;
            b = a;
            a = s;
        }

        char[] temp = a.toCharArray();

        int j = b.length()-1;
        char carry = '0';
        for(int i = a.length()-1;i>=0;i--){
            if(j>=0){
                if(temp[i] == '1' && b.charAt(j)=='1'){
                    temp[i] = carry;
                    carry = '1';
                }else if(a.charAt(i) != b.charAt(j)){
                    if(carry == '1'){
                        temp[i] = '0';
                        carry = '1';
                    }else{
                        temp[i] = '1';
                    } 
                }else{
                    temp[i] = carry;
                    carry = '0';
                }
                j--;
            }else{
                if(temp[i] == '1'){
                    if(carry == '1'){
                        temp[i] = '0';
                    }
                }else{
                    if(carry == '1'){
                        temp[i] = '1';
                        carry = '0';
                    }
                }
            }
        }

        a = new String(temp);
        if(carry == '1'){
            a = '1' + a;
        }
        
        return a;
    }
}