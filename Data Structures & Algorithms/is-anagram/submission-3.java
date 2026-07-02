class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();

        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        if(s1.length != s2.length)
            return false;
        
        for(char c : s1){
            // if(m1.containsKey(c))
                m1.put(c, m1.getOrDefault(c, 0) + 1);
        }

        for(char c : s2){
            // if(m1.containsKey(c))
                m2.put(c, m2.getOrDefault(c, 0) + 1);
        }

        return m1.equals(m2);

        // return false;
    }
}
