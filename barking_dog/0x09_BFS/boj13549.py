# https://www.acmicpc.net/problem/13549
# 13549번 - 숨바꼭질3

from collections import deque

def bfs(n: int) -> int:
	q: deque[list[int]] = deque()
	q.append([n, 0])
	visited[n] = True

	while q:
		current, time = q.popleft()
		if current == K:
			return time
		if 0 <= current * 2 < MAX and not visited[current * 2]:
			visited[current * 2] = True
			q.append([current * 2, time])
		if 0 <= current - 1 < MAX and not visited[current - 1]:
			visited[current - 1] = True
			q.append([current - 1, time + 1])
		if 0 <= current + 1 < MAX and not visited[current + 1]:
			visited[current + 1] = True
			q.append([current + 1, time + 1])

	return -1


N, K = map(int, input().strip().split())
MAX = 100001
visited: list[bool] = [False] * MAX
print(bfs(N))