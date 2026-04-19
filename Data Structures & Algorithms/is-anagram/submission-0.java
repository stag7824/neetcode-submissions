class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length())
            return false;
        
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();


        for(int i=0;i<s1.length;i++){
            if(map1.get(s1[i]) != null){
                map1.put(s1[i], (map1.get(s1[i])) + 1);
            }
            else{
                map1.put(s1[i], 1);
            }

            if(map2.get(t1[i])!= null){
                map2.put(t1[i], map2.get(t1[i]) + 1);
            }
            else{
                map2.put(t1[i], 1);
            }
        }

        return map1.equals(map2);

    }
}
