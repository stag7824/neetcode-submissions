class Solution {
    public boolean isPalindrome(String s) {
        String strippedStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] charArr = strippedStr.toCharArray();
        for(int i = 0, j = strippedStr.length()-1; i < strippedStr.length()/2; i++,j--){
            if(charArr[i] != charArr[j])
                return false;
        }
                            //  s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        // System.out.println(strippedStr);
        return true;
    }
}
