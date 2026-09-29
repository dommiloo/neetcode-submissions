class Solution {
    public String minWindow(String s, String t) {
        

        if(t.length() > s.length()){
            return "";

        }

        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for ( char c : t.toCharArray()){
            need.put(c, need.getOrDefault(c,0) + 1);

        }

        int left =0;

        int have = 0;

        int needCount = need.size();

        int bestLength = Integer.MAX_VALUE;
        int bestStart = 0;
        
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            
            window.put(c, window.getOrDefault(c,0) + 1);

            if(need.containsKey(c) && window.get(c).intValue() == need.get(c).intValue()){
                have++;
            }

            while (have == needCount){

                int currLength = right - left + 1;

                if(currLength < bestLength){
                    bestLength = currLength;
                    bestStart = left;
                }

                char leftChar = s.charAt(left);

                window.put(leftChar, window.get(leftChar) -1);

                if(need.containsKey(leftChar) &&
                    window.get(leftChar) < need.get(leftChar)){
                        have--;
                    }
                    left++;
            }
        }
        if (bestLength == Integer.MAX_VALUE){
            return "";
        }
        
        return s.substring(bestStart, bestStart + bestLength);

    }
}
