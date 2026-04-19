class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length())
            return false;
        
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // char[] s1 = s.toCharArray();
        // char[] t1 = t.toCharArray();


        // for(int i=0;i<s.length();i++){
        //     map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i),0)+1);
        //     map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i),0)+1);

        //     // if()
        //     // if(map1.get(s1[i]) != null){
        //     //     map1.put(s1[i], (map1.get(s1[i])) + 1);
        //     // }
        //     // else{
        //     //     map1.put(s1[i], 1);
        //     // }

        //     // if(map2.get(t1[i])!= null){
        //     //     map2.put(t1[i], map2.get(t1[i]) + 1);
        //     // }
        //     // else{
        //     //     map2.put(t1[i], 1);
        //     // }
        // }

        // Array method
        int[] counter = new int[26]; // 26 characters

        for(int i = 0; i< s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for(int val: counter){
            if(val != 0)
                return false;
        }
        return true;
        // return map1.equals(map2);

    }
}
