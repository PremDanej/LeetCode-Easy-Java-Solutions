class Solution {

    public int findMaxK(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        int max = -1;
        for(int item : nums){
            if(Math.abs(item) > max){
                if(unique.contains(-item)) max = Math.abs(item);
                else unique.add(item);
            }
        }
        // System.gc(); // calling garbage collector.
        return max;
    }
}