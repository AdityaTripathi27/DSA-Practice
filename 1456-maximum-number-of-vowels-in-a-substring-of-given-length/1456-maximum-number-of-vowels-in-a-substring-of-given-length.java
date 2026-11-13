class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int curr = 0;
        int fin = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                curr++;
            }
        }

        fin = curr;

        for (int i = k; i < n; i++) {
            if (isVowel(s.charAt(i))) {
                curr++;
            }

            if (isVowel(s.charAt(i-k))) {
                curr--;
            }

            fin = Math.max(fin, curr);
        }

        return fin;
    }

    public boolean isVowel(char ch) {
        return ch=='a' || ch=='e' || ch=='i' ||
               ch=='o' || ch=='u';
    }
}