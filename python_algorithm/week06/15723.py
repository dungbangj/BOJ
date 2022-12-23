import sys

input = sys.stdin.readline

n = int(input())

T = [[] for _ in range(26)]

def dfs(T, V):
    if visited[V] is True:
        return
    visited[V] = True
    for i in T[V]:
        dfs(T, i)

for _ in range(n):
    i, _, j = input().split()
    T[ord(i) - 97].append(ord(j) - 97)

m = int(input())

for _ in range(m):
    i, _, j = input().split()
    visited = [False] * 26
    dfs(T, ord(i) - 97)
    if visited[ord(j) - 97] is True:
        print("T")
    else:
        print("F")