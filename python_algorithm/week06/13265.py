# 13265 색칠하기

import sys
input = sys.stdin.readline

def dfs(V, count):
    tmp = color[V]
    if count % 2 == 1:
        color[V] = 1
    else:
        color[V] = 2
    if tmp != 0 and tmp != color[V]:
        color[0] = 123123
    if visited[V] is True:
        return
    visited[V] = True
    for i in T[V]:
        dfs(i, count + 1)


t = int(input())

for _ in range(t):
    n, m = map(int, input().split())
    T = [[] for _ in range(n + 1)]
    nums = []
    for _ in range(m):
        i, j = map(int, input().split())
        T[i].append(j)
        T[j].append(i)
        nums.append(i)
        nums.append(j)
    nums.sort()

    visited = [False] * (n + 1)
    color = [0] * (n + 1)
    dfs(nums[0], 1)

    if color[0] == 123123:
        print("impossible")
    else:
        print("possible")
