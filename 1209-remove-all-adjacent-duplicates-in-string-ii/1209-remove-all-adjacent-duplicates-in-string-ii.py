class Solution:
    def removeDuplicates(self, s: str, k: int) -> str:        
        st = [[s[0], 1]]
        
        for ch in s[1:]:
            if not st:
                st.append([ch, 1])
                continue
            e = st[-1][0]
            cnt = st[-1][1]
            if e == ch:
                cnt += 1
            else:
                cnt = 1
            st.append([ch, cnt])
            if cnt == k:
                for _ in range(cnt):
                    st.pop()
        return "".join([i[0] for i in st])