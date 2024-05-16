# https://www.acmicpc.net/problem/2146
# 2146번 - 다리 만들기

from collections import deque

def bfs_for_overwrite(i: int, j: int, count: int) -> None:
	q: deque[list[int]] = deque()
	q.append([i, j])
	visited[i][j] = True
	board[i][j] = count

	while q:
		i, j = q.popleft()
		for dx, dy in [[1, 0], [-1, 0], [0, 1], [0, -1]]:
			nx, ny = i + dx, j + dy
			if 0 <= nx < N and 0 <= ny < N and board[nx][ny] == 1 and not visited[nx][ny]:
				q.append([nx, ny])
				visited[nx][ny] = True
				board[nx][ny] = count

def bfs_for_bridge(island: int) -> int:
	dist: list[list[int]] = [[-1] * N for _ in range(N)]
	q: deque[list[int]] = deque()

	for i in range(N):
		for j in range(N):
			if board[i][j] == island:
				for dx, dy in [[1, 0], [-1, 0], [0, 1], [0, -1]]:
					nx, ny = i + dx, j + dy
					if 0 <= nx < N and 0 <= ny < N and board[nx][ny] == 0:
						q.append([i, j])
						dist[i][j] = 0

	while q:
		x, y = q.popleft()
		for dx, dy in [[1, 0], [-1, 0], [0, 1], [0, -1]]:
			nx, ny = x + dx, y + dy
			if 0 <= nx < N and 0 <= ny < N:
				if board[nx][ny] > 1 and board[nx][ny] != island:
					return dist[x][y]
				if board[nx][ny] == 0 and dist[nx][ny] == -1:
					dist[nx][ny] = dist[x][y] + 1
					q.append([nx, ny])
	return -1
	


N = int(input().strip())
board: list[list[int]] = [[int(i) for i in input().strip().split()] for _ in range(N)]
count = 2
visited: list[list[bool]] = [[False] * N for _ in range(N)]

for i in range(N):
	for j in range(N):
		if board[i][j] == 1 and not visited[i][j]:
			bfs_for_overwrite(i, j, count)
			count += 1

result = float('inf')
for island in range(2, count):
	result = min(result, bfs_for_bridge(island))
print(result)