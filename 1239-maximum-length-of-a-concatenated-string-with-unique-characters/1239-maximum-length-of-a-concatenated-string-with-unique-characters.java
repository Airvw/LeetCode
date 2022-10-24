class Solution {
    int answer = 0;

    public int maxLength(List<String> arr) {
        dfs(arr, "", 0);
        return answer;
    }

    private void dfs(List<String> arr, String s, int idx) {
        boolean isUnique = validateStr(s);
        if(isUnique) answer = Math.max(answer, s.length());
        if(!isUnique || idx == arr.size()) return;

        for(int i = idx; i < arr.size(); i++){
            dfs(arr, s + arr.get(i), i + 1);
        }
    }

    private boolean validateStr(String s) {
        HashSet<Character> hashSet = new HashSet<>();
        for(Character ch : s.toCharArray())
            hashSet.add(ch);
        if(s.length() != hashSet.size()) return false;
        return true;
    }
}