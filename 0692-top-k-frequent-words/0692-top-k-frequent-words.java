class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        int maxCnt = 0;
        for(String word : words){
            map.put(word, map.getOrDefault(word, 0) + 1);
            maxCnt = Math.max(maxCnt, map.get(word));
        }
        List<String>[] cntArr = new ArrayList[maxCnt + 1];
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            int cntIdx = entry.getValue();
            if(cntArr[cntIdx] == null){
                cntArr[cntIdx] = new ArrayList<>();
            }
            cntArr[cntIdx].add(entry.getKey());
        }
        List<String> ans = new ArrayList<>();

        for(int i = maxCnt; i >= 0 && ans.size() < k; i--){
            if(cntArr[i] != null){
                Collections.sort(cntArr[i]);
                ans.addAll(cntArr[i]);
            }
        }
        
        return ans.subList(0, k);
    }
}
