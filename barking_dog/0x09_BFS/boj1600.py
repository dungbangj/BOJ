# https://www.acmicpc.net/problem/1600
# 1600번 - 말이 되고픈 원숭이

from collections import deque
from typing import Any

def bfs(k: int) -> int:
	q: deque[list[Any]] = deque()
	q.append([0, 0, 0, k])
	visited[0][0][k] = True

	normal_moves = [(1, 0), (-1, 0), (0, 1), (0, -1)]
	horse_moves = [(1, -2), (1, 2), (-1, 2), (-1, -2), (2, -1), (2, 1), (-2, 1), (-2, -1)]

	while q:
		x, y, count, k = q.popleft()
		if x == H - 1 and y == W - 1:
			return count

		for dx, dy in normal_moves:
			nx, ny = x + dx, y + dy
			if 0 <= nx < H and 0 <= ny < W and board[nx][ny] == 0 and not visited[nx][ny][k]:
				q.append([nx, ny, count + 1, k])
				visited[nx][ny][k] = True
		
		if k > 0:
			for dx, dy in horse_moves:
				nx, ny = x + dx, y + dy
				if 0 <= nx < H and 0 <= ny < W and board[nx][ny] == 0 and not visited[nx][ny][k - 1]:
					q.append([nx, ny, count + 1, k - 1])
					visited[nx][ny][k - 1] = True
	return -1


K = int(input().strip())
W, H = map(int, input().strip().split())
board: list[list[int]] = [[int(i) for i in input().strip().split()] for _ in range(H)]
visited: list[list[list[bool]]] = [[[False] * (K + 1) for _ in range(W)] for _ in range(H)]

print(bfs(K))