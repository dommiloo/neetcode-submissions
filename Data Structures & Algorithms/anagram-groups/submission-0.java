class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray(); 

            Arrays.sort(chars);

            String key = new String(chars);

            if (!map.containsKey(key))  {
                map.put(key, new ArrayList<>());

            }   

            map.get(key).add(word);  //adds the word to its created Arraylist(or existing arraylist) 
        } 

        return new ArrayList<>(map.values());

    }
}
