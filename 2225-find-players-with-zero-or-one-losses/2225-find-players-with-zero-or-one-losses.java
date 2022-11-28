class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> answer = new ArrayList<>();
        Map<Integer, Integer> winnerMap = new HashMap();
        Map<Integer, Integer> loserMap = new HashMap<>();
        for(int[] match : matches){
            int winnerVal = match[0];
            int loserVal = match[1];
            winnerMap.put(winnerVal, winnerMap.getOrDefault(winnerVal, 0) + 1);
            loserMap.put(loserVal, loserMap.getOrDefault(loserVal, 0) + 1);
        }
        List<Integer> winnerList = new ArrayList<>();
        List<Integer> loserList = new ArrayList<>();
        for(int key : winnerMap.keySet()){
            if(!loserMap.containsKey(key)) winnerList.add(key);
        }
        winnerList.sort((o1, o2) -> o1 > o2 ? 1 : -1);
        answer.add(winnerList);

        for(int key : loserMap.keySet()){
            if(loserMap.get(key) == 1)  loserList.add(key);
        }
        loserList.sort((o1, o2) -> o1 > o2 ? 1 : -1);
        answer.add(loserList);
        return answer;
    }
}