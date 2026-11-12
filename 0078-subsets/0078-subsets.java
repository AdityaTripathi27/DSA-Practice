class Solution {
    public static void solve(int i,int nums[],List<Integer> cop,List<List<Integer>> op)
    {
          if(i == nums.length) {
            op.add(new ArrayList<>(cop));
            return;
        }
        
        cop.add(nums[i]);
        solve(i+1,nums,cop,op);

        cop.remove(cop.size()-1);
        solve(i+1,nums,cop,op);
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> op=new ArrayList<>();
        List<Integer> cop=new ArrayList<>();
        solve(0,nums,cop,op);
        return op;
    }
}