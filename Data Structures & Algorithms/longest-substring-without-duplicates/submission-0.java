class Solution {
    public int lengthOfLongestSubstring(String s) {
        int bestCount = 0;

        for (int i = 0; i < s.length(); i++) {

            HashSet<Character> seen = new HashSet<>();

            for (int j = i; j < s.length(); j++) {

                if (seen.contains(s.charAt(j))) {
                    break;
                }

                seen.add(s.charAt(j));

                bestCount = Math.max(bestCount, j - i + 1);
            }
        }

        return bestCount;
    }
}
