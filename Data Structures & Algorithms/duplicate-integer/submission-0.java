class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        boolean contains = false;
        for(int num:nums){
            if(set.contains(num)){
                contains = true;
            }
            set.add(num);
        }
        return contains;
    }
}