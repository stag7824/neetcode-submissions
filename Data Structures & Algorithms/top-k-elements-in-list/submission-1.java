class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Create a hashmap and add values against it, then iterate it or sort it and reutrn that part onlyabstract

        Map<Integer, Integer> frequency = new HashMap<>();
        for(int num: nums){
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        
        // Map<Integer> topKFrequent = new ArrayList<>();
        // for(int i)
        // return frequency.;
        // return frequency.entrySet()
        //     .stream()
        //     .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        //     .limit(k)
        //     .mapToInt(Map.Entry::getKey)
        //     .toArray();
        // Creating buckets
        List<int[]> bucket = new ArrayList<>(); // each element is an array

        for(Map.Entry<Integer, Integer> entry: frequency.entrySet()){
            bucket.add(new int[]{entry.getValue(), entry.getKey()});
        }
        // Sorting it
        bucket.sort((a, b) -> b[0] - a[0]);
        int[] result = new int[k];
        for(int i=0; i<k;i++){
            result[i] = bucket.get(i)[1];
        }

        return result;


    }
}
