class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // ArrayList<Integer> arr = new ArrayList<>();
        // int prevValue = nums[0], count = 0, ignoreValue = Integer.MAX_VALUE;
        // for(int i:nums){
        //     if(prevValue == i && ignoreValue != i){
        //         count ++;
        //     }

        //     if(prevValue == i && count >= k && prevValue != ignoreValue){
        //         arr.add(i);
        //         ignoreValue = i;
        //         count = 0;
        //     }

        //     prevValue = i;
        //     count++;
        // }

        // return arr.stream().mapToInt(Integer::intValue).toArray();

        HashMap<Integer, Integer> records = new HashMap<>();

        for(int i: nums){
            // if(records.containsKey(i)){
                records.put(i, records.getOrDefault(i, 0) + 1);
            // }
            // else{
            //     records.put(i, 0);
            // }
        }

        return records.keySet().stream()
        // Sort keys based on their corresponding values in descending order
                .sorted((a, b) -> records.get(b) - records.get(a)) 
                .limit(k)
                // Convert Integer objects to primitive ints
                .mapToInt(Integer::intValue)
                .toArray();


        
    }
}
