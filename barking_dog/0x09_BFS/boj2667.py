# https://www.acmicpc.net/problem/2667
# 2667번 - 단지번호붙이기

from collections import deque

def bfs(x: int, y: int) -> int:
	q: deque[list[int]] = deque()
	q.append([x, y])
	board[x][y] = 0
	width: int = 1

	while q:
		x, y = q.popleft()
		for i in range(len(dx)):
			nx, ny = x + dx[i], y + dy[i]
			if 0 <= nx < N and 0 <= ny < N and board[nx][ny] == 1:
				width += 1
				board[nx][ny] = 0
				q.append([nx, ny])
	return width

N: int = int(input().strip())
board: list[list[int]] = []
dx: list[int] = [1, -1, 0, 0]
dy: list[int] = [0 ,0, 1, -1]

for i in range(N):
	board.append([int(i) for i in input().strip()])

count: int = 0
widths: list[int] = []

for i in range(N):
	for j in range(N):
		if board[i][j] == 1:
			count += 1
			widths.append(bfs(i, j))

widths.sort()

print(count)
for i in widths:
	print(i)


