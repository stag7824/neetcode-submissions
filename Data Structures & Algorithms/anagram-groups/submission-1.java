class Solution {
    public String sortedStr(String str){
        // String to char and then string
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        // Array Sorting Method
        // List<List<String>> lst = new ArrayList<>();
        // System.out.println("sorted : "+ sortedStr(strs[3]));
        // int length =0;
        // for(int i = 0; i<strs.length(); i++){
        //     List<String> TempList = new ArrayList<>();
        //     TempList.add(strs[i]);
        //     for (int j=i;j<strs.length(); j++) {
                

        //     }
        // }
        // // for ()
        // return lst;

        // Attempt #2

        Map<String, List<String>> groupAnnagrams = new HashMap<>();
        for (String str: strs){
            // Get Array
            char[] charArr = str.toCharArray();
            // Sort Array
            Arrays.sort(charArr);
            // recombing it
            String sortedStr = String.valueOf(charArr);
            // adding it to the hashmap (sortedArr, Original Value)
            // if no init, we init
            if(!groupAnnagrams.containsKey(sortedStr)){
                groupAnnagrams.put(sortedStr, new ArrayList<>());
            }
            groupAnnagrams.get(sortedStr).add(str);
        }
        return new ArrayList<>(groupAnnagrams.values());
    }
}
