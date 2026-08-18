class Solution {
    public String longestCommonPrefix(String[] strs) {
        boolean match = true;
        String result = "";
        for(int j = 0; j<strs[0].length();j++){
            for(int i = 1; i<strs.length;i++){
                if(j>=strs[i].length() || strs[0].charAt(j) != strs[i].charAt(j)){
                    if(j == 0){
                        return "";
                    }
                    match = false;
                    break;
                }
            }
            if(!match){
                break;
            }
            result+=strs[0].charAt(j);
        }
        return result;
    }
}