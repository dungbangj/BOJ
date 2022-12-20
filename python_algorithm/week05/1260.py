# # 1260 : dfs() and bfs()

import sys

input = sys.stdin.readline


def dfs(T, V, visited):
    if visited[V]:
        return
    visited[V] = True
    print(V, end=" ")
    for i in T[V]:
        dfs(T, i, visited)


def bfs(T, V):
    visited = [False] * len(T)
    queue = [V]
    visited[V] = True
    print(V, end=" ")
    while len(queue) > 0:
        V = queue.pop(0)
        for i in T[V]:
            if visited[i] is False:
                queue.append(i)
                visited[i] = True
                print(i, end=" ")


N, M, V = map(int, input().split())

T = [[] for _ in range(N + 1)]
visited = [False] * (N + 1)

for _ in range(M):
    i, j = map(int, input().split())
    T[i].append(j)
    T[j].append(i)

for i in range(N + 1):
    T[i].sort()

dfs(T, V, visited)
print()
bfs(T, V)
