# https://www.acmicpc.net/problem/2583
# 2583번 - 영역 구하기

from collections import deque

def bfs(x: int, y: int) -> int:
	q: deque[list[int]] = deque()
	q.append([x, y])
	board[x][y] = 1
	count: int = 1

	while q:
		x, y = q.popleft()
		for i in range(len(dx)):
			nx, ny = x + dx[i], y + dy[i]
			if 0 <= nx < len(board) and 0 <= ny < len(board[0]) and board[nx][ny] == 0:
				q.append([nx, ny])
				board[nx][ny] = 1
				count += 1
	return count

N, M, K = map(int, input().strip().split())
board: list[list[int]] = [[0] * M for _ in range(N)]
dx: list[int] = [1, -1, 0, 0]
dy: list[int] = [0, 0, 1, -1]

for _ in range(K):
	s_x, s_y, e_x, e_y = map(int, input().strip().split())
	for i in range(s_y, e_y):
		for j in range(s_x, e_x):
			board[i][j] = 1

count: int = 0
counts: list[int] = []
for i in range(len(board)):
	for j in range(len(board[i])):
		if board[i][j] == 0:
			count += 1
			counts.append(bfs(i, j))
print(count)
print(*sorted(counts))