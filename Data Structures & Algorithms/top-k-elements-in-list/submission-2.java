// import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        // Count frequency
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        // Convert map to list
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());

        // Sort by frequency (highest first)
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        // Create answer array
        int[] ans = new int[k];

        // Take first k elements
        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i).getKey();
        }

        return ans;
    }
}