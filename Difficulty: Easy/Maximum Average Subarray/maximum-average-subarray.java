class Solution {
    public int findMaxAverage(List<Integer> arr, int k) {

        int curr = 0;

        for (int i = 0; i < k; i++) {
            curr += arr.get(i);
        }

        int sum = curr;
        int p = 0;

        for (int i = k; i < arr.size(); i++) {

            curr += arr.get(i) - arr.get(i - k);

            if (curr > sum) {
                sum = curr;
                p = i - k + 1;
            }
        }

        return p;
    }
}