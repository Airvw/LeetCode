class Solution:
    def twoCitySchedCost(self, costs: List[List[int]]) -> int:
        answer = 0
        costs.sort(key = lambda x : -abs(x[0] - x[1]))
        a_cnt = 0
        b_cnt = 0
        n = len(costs) // 2
        for idx, cost in enumerate(costs):
            a, b = cost
            if a_cnt == n or b_cnt == n:
                if a_cnt == n:
                    answer += b
                else:
                    answer += a
            else:
                if a < b:
                    answer += a
                    a_cnt += 1
                else:
                    answer += b
                    b_cnt += 1
        return answer