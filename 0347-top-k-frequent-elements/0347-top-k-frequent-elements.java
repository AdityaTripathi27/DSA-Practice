class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(
            (a,b)->hm.get(b)-hm.get(a)
        );

        for(int key:hm.keySet())
        {
            pq.add(key);
        }

        int arr[]=new int[k];
        for(int i=0;i<k;i++)
        {
            arr[i]=pq.poll();
        }
        return arr;
    }
}