# 16562 친구비

import sys
input = sys.stdin.readline
sys.setrecursionlimit(10 ** 6)

N, M, k = map(int, input().split())
price = list(map(int, input().split()))
price.insert(0, 0)

T = [[] for _ in range(N + 1)]
connected_graph = [[] for _ in range(N + 1)]
visited = [False] * (N + 1)
count = 0
sum = 0

for _ in range(M):
    i, j = map(int, input().split())
    T[i].append(j)
    T[j].append(i)

def dfs(start):
    if visited[start] is True:
        return
    visited[start] = True
    connected_graph[count].append(price[start])
    for i in T[start]:
        dfs(i)

for i in range(1, N + 1):
    if visited[i] is True:
        continue
    dfs(i)
    if connected_graph[count]:
        sum += min(connected_graph[count])
        count += 1

if sum <= k:
    print(sum)
else:
    print("Oh no")