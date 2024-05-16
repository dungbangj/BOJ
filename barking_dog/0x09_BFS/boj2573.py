# https://www.acmicpc.net/problem/2573
# 2573번 - 빙산

from collections import deque

dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]

def bfs(x: int, y: int) -> None:
	q: deque[list[int]] = deque()
	q.append([x, y])
	visited[x][y] = True

	while q:
		x, y = q.popleft()
		for i in range(4):
			nx, ny = x + dx[i], y + dy[i]
			if 0 <= nx < N and 0 <= ny < M and board[nx][ny] > 0 and not visited[nx][ny]:
				visited[nx][ny] = True
				q.append([nx, ny])


def melt_ice() -> None:
	melt_list: list[list[int]] = []

	for i in range(N):
		for j in range(M):
			if board[i][j] > 0:
				melt_count = 0
				for k in range(4):
					nx, ny = i + dx[k], j + dy[k]
					if 0 <= nx < N and 0 <= ny < M and board[nx][ny] == 0:
						melt_count += 1
				if melt_count > 0:
					melt_list.append([i, j, melt_count])

	for i, j, melt_count in melt_list:
		board[i][j] = max(board[i][j] - melt_count, 0)


N, M = map(int, input().split())
board: list[list[int]] = [[int(i) for i in input().strip().split()] for _ in range(N)]
year = 0

while True:
	visited: list[list[bool]] = [[False] * M for _ in range(N)]
	count = 0
	for i in range(N):
		for j in range(M):
			if board[i][j] != 0 and not visited[i][j]:
				count += 1
				bfs(i, j)
	if count > 1:
		print(year)
		break
	if count == 0:
		print(0)
		break
	melt_ice()
	year += 1

