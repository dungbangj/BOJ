# 1464 뒤집기 3

import sys
input = sys.stdin.readline
sys.setrecursionlimit(10 ** 6)
S = input().strip()

for i in range(len(S) - 1):
    if S[i] > S[i + 1] and S[i + 1] <= S[0]:
        S = S[:i + 1][::-1] + S[i + 1:]
        if S[i] >= S[i + 1]:
            S = S[:i + 2][::-1] + S[i + 2:]

print(S)