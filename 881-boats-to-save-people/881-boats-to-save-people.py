class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
        people.sort()
        i, j = 0, len(people) - 1
        answer = 0
        while i <= j:
            hap = people[i] + people[j]
            if hap > limit:
                j -= 1
                answer += 1
            else:
                answer += 1
                i += 1
                j -= 1
        return answer
            