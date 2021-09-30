class Solution:
    def check(self, x : int) -> bool:
        min_v = -2**31
        max_v = 2**31 - 1
        if min_v <= x <= max_v:
            return True
        else:
            return False
    def reverse(self, x: int) -> int:
        x_str = str(x)
        if x_str[0] == "-":
            reverse_x = -1 * int(x_str[:0:-1])
            if self.check(reverse_x):
                return reverse_x
            else:
                return 0
        else:
            reverse_x = int(x_str[::-1])
            if self.check(reverse_x):
                return reverse_x
            else:
                return 0
    