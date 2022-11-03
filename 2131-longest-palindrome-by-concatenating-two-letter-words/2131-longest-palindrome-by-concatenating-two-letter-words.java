class Solution {
    public int longestPalindrome(String[] words) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();

        for(String word : words){
            map.put(word, map.getOrDefault(word, 0) + 2);
        }

        boolean isSameWord = false;
        for(String key : map.keySet()){
            String reversedWord = String.valueOf(key.charAt(1)) + String.valueOf(key.charAt(0));
            if(key.equals(reversedWord)){
                int cnt = map.get(key);
                if(cnt % 4 != 0) isSameWord = true;
                answer += cnt - cnt % 4;
            }
            else{
                if(map.containsKey(key) && map.containsKey(reversedWord)){
                    answer += Math.min(map.getOrDefault(key, 0), map.getOrDefault(reversedWord, 0));
                }
            }
        }

        if (isSameWord) answer += 2;
        
        return answer;
    }
}