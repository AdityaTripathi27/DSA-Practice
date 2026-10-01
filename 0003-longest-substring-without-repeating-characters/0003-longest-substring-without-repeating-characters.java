class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            boolean arr[]=new boolean[256];
            for(int j=i;j<n;j++)
            {
                if(arr[s.charAt(j)])
                {
                    break;
                }
                count=Math.max(count,j-i+1);
                arr[s.charAt(j)]=true;
            }
        }
        return count;

    }
}