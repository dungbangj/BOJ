# https://www.acmicpc.net/problem/13913
# 13913번 - 숨바꼭질 4

from collections import deque

def bfs(N: int, k: int) -> list[int]:
	q: deque[int] = deque()
	q.append(N)
	MAX = 100001
	visited: list[int] = [False] * MAX
	visited[N] = True
	prev = [-1] * MAX

	while q:
		n = q.popleft()
		if n == k:
			break
		for i in [2 * n, n - 1, n + 1]:
			if 0 <= i < MAX and not visited[i]:
				visited[i] = True
				prev[i] = n
				q.append(i)
	path: list[int] = []
	while k != -1:
		path.append(k)
		k = prev[k]
	path.reverse()
	return path


N, K = map(int, input().strip().split())
result = bfs(N, K)
print(len(result) - 1)
print(*result)