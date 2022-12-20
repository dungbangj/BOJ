# 11724 연결 요소의 개수

import sys
input = sys.stdin.readline

N, M = map(int, input().split())
T = [[] for _ in range(N + 1)]
tmp_T = []

def bfs(T, visited_nodes, v):
    visited = [False] * (N + 1)
    queue = [v]
    visited[v] = True
    visited_nodes.append(v)
    while len(queue) > 0:
        v = queue.pop(0)
        for i in T[v]:
            if visited[i] is False:
                queue.append(i)
                visited_nodes.append(i)
                visited[i] = True


def is_in(tmp_T, element):
    for i in tmp_T:
        if element in i:
            return True
    return False

for _ in range(M):
    i, j = map(int, input().split())
    T[i].append(j)
    T[j].append(i)

for i in range(1, len(T)):
    if is_in(tmp_T, i):
        continue
    visited_nodes = []
    bfs(T, visited_nodes, i)
    tmp_T.append(visited_nodes)

print(len(tmp_T))