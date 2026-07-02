class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet set = new HashSet();
        for(int i: nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
            // System.out.println("Output " + i);

        }
        return false;
    }
}