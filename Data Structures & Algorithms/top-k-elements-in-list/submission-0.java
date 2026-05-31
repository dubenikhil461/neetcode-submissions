class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Min Heap based on frequency
        PriorityQueue<int[]> heap = new PriorityQueue<>(
            (a, b) -> a[1] - b[1]
        );

        // Step 3: Maintain top k
        for (int key : map.keySet()) {
            int freq = map.get(key);

            heap.add(new int[]{key, freq});

            if (heap.size() > k) {
                heap.poll();
            }
        }

        // Step 4: Extract result
        int[] result = new int[k];
        int i = 0;

        while (!heap.isEmpty()) {
            result[i++] = heap.poll()[0];
        }

        return result;
    }
}