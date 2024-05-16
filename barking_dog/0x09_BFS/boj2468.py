# https://www.acmicpc.net/problem/2468
# 2468번 - 안전 영역

from collections import deque

def bfs(x: int, y: int, height: int) -> None:
	q: deque[list[int]] = deque()
	q.append([x, y])
	visited[x][y] = True

	while q:
		x, y = q.popleft()
		for i in range(4):
			nx, ny = x + dx[i], y + dy[i]
			if 0 <= nx < N and 0 <= ny < N and not visited[nx][ny] and city[nx][ny] >= height:
				visited[nx][ny] = True
				q.append([nx, ny])


N = int(input().strip())
city: list[list[int]] = [[i for i in list(map(int, input().strip().split()))] for _ in range(N)]
max_h, min_h = -1, 101
dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]

for i in range(N):
	max_h: int = max(max(city[i]), max_h)
	min_h: int = min(min(city[i]), min_h)

max_count = -1
for h in range(min_h, max_h + 1):
	visited: list[list[bool]] = [[False for _ in range(len(city))] for _ in range(len(city))]
	count = 0

	for i in range(len(city)):
		for j in range(len(city)):
			if city[i][j] >= h and not visited[i][j]:
				bfs(i, j, h)
				count += 1
	max_count: int = max(count, max_count)

print(max_count)
