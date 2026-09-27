class Solution {
    public void moveZeroes(int[] arr) {
         int count=0;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                count++;
                continue;
            }
            a.add(arr[i]);
            
        }
        while(count!=0)
        {
            a.add(0);
            count--;
        }
        for(int i=0;i<a.size();i++)
        {
            arr[i]=a.get(i);
        }  
    }
}