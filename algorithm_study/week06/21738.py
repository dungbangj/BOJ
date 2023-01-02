# 21738 얼음께기 펭귄

import sys
input = sys.stdin.readline
sys.setrecursionlimit(10 ** 6)

N, S, P = map(int, input().split())
T = [[] for _ in range(N + 1)]
visited = [False] * (len(T) + 1)
counts = []

for _ in range(N - 1):
    i, j = map(int, input().split())
    T[i].append(j)
    T[j].append(i)


def dfs(V, count):
    if visited[V] is True:
        return
    if V == P:
        counts.append(count)
        return
    visited[V] = True
    for i in T[V]:
        dfs(i, count + 1)


for i in range(1, S + 1):
    dfs(i, 0)

counts.sort()

sum = 1
for i in range(2):
    sum += counts[i]

print(N - sum)