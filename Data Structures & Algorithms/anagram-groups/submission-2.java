class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            char[] strArray = str.toCharArray();
            Arrays.sort(strArray);; // Sorting the Array
            String sortedValue = new String(strArray);

            if(!map.isEmpty() && map.containsKey(sortedValue)){
                map.get(sortedValue).add(str);
            }
            else
            {
                map.put(sortedValue, new ArrayList<String>());
                map.get(sortedValue).add(str);
            }
        }
        // List<String> result = new ArrayList<String>();

        return new ArrayList<List<String>>(map.values());
    }
}
