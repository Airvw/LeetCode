class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        strs.sort(key = lambda x : len(x))
        result = ""
        flag = True
        for i in range(len(strs[0])):
            array = []
            for s in strs:
                array.append(s[i])
            if len(set(array)) == 1:
                result += array[0]
            else:
                flag = False
            if not flag:
                break
        return result