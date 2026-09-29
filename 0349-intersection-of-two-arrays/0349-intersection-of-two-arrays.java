class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       // ArrayList<Integer> arr=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        HashSet<Integer> hs1=new HashSet<>();
       
        ArrayList<Integer> ar=new ArrayList<>();
        for(int n:nums1)
        {
            hs.add(n);
        }
        for(int n:nums2)
        {
            hs1.add(n);
        }
      
        for(int n: hs)
        {
            if(hs1.contains(n))
            {
                ar.add(n);
            }
        }
         int arr[]=new int[ar.size()];
        for(int i=0;i<ar.size();i++)
        {
            arr[i]=ar.get(i);
        }
        return arr;
    }
}