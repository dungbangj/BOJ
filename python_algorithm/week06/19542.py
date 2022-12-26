# 19542 전단지 돌리기

import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**5)

def dfs(cur, pre):
    global ans
    max_d = 0
    for i in graph[cur]:
        if i != pre:
            max_d = max(max_d,dfs(i, cur))
    if max_d >= D:
        ans += 1
    return max_d + 1


N, S, D = map(int, input().split())
graph = {i: [] for i in range(1,N+1)}
ans = 0

for _ in range(N-1):
    x, y = map(int, input().split())
    graph[x] += [y]
    graph[y] += [x]

dfs(S, 0)
if ans != 0:
    print(2 * (ans - 1))
else:
    print(0)