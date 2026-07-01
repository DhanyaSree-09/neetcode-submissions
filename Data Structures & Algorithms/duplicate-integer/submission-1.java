// import java.util.*; 

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i : nums){
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        for(int i : hm.values()){
            if(i > 1){
                return true;
            }
        }

        return false;
    }
}