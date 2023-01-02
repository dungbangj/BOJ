# 24479 : 알고리즘 수업 - 깊이 우선 탐색 1

import sys
input = sys.stdin.readline
sys.setrecursionlimit(10 ** 9)

N, M, R = map(int, input().split())
T = [[] for _ in range(N + 1)]
visited = [False] * (N + 1)
result_map = {}

def dfs(R):
    global count
    visited[R] = True
    result_map[R] = count
    count += 1
    for i in T[R]:
        if visited[i] is False:
            dfs(i)


for i in range(N + 1):
    result_map[i] = 0

for _ in range(M):
    i, j = map(int, input().split())
    T[i].append(j)
    T[j].append(i)

for i in range(N + 1):
    T[i].sort()

count = 1
dfs(R)
for i in range(1, N + 1):
    print(result_map[i])



