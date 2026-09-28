class Solution {
    public int maxFrequencyElements(int[] nums) {
       HashMap<Integer,Integer> hm=new HashMap<>();
       int sum=0;
       for(int n:nums)
       {
        hm.put(n,hm.getOrDefault(n,0)+1);
       }
       int max=0;
       for(int n:hm.values())
       {
        max=Math.max(max,n);
       }
       for(int  n:hm.values())
       {
        if(n==max)
        {
            sum+=n;
        }
       }
       return sum;
    }
}