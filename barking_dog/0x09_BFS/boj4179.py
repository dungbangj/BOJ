# https://www.acmicpc.net/problem/4179
# 4179번 - 불!
# 불이 무조건 먼저 움직이는게 필수인 문제이다
from collections import deque
from typing import Any

def bfs() -> int:
	while jh_q:
		for _ in range(len(fire_q)):
			popped_xy: list[Any] = fire_q.popleft()
			x: int = popped_xy[0]
			y: int = popped_xy[1]

			for i in range(len(dx)):
				nx: int = x + dx[i]
				ny: int = y + dy[i]

				if 0 <= nx < n and 0 <= ny < m and maze[nx][ny] == '.':
					fire_q.append([nx, ny])
					maze[nx][ny] = 'F'

		for _ in range(len(jh_q)):
			popped_xy: list[Any] = jh_q.popleft()
			x: int = popped_xy[0]
			y: int = popped_xy[1]

			for i in range(len(dx)):
				nx: int = x + dx[i]
				ny: int = y + dy[i]

				if 0 <= nx < n and 0 <= ny < m:
					if maze[nx][ny] == '.' and day_counts[nx][ny] == 0:
						day_counts[nx][ny] = day_counts[x][y] + 1
						jh_q.append([nx, ny])
				else:
					return day_counts[x][y]
	return -1

input_nm: list[int] = list(map(int, input().split()))
n: int = input_nm[0]
m: int = input_nm[1]
jh_q: deque[list[int]] = deque()
fire_q: deque[list[int]] = deque()
dx: list[int] = [1, -1, 0, 0]
dy: list[int] = [0, 0, 1, -1]
maze: list[list[str]] = [[i for i in input().strip()] for _ in range(n)]
day_counts: list[list[int]] = [[0] * m for _ in range(n)]

for i in range(n):
	for j in range(m):
		if maze[i][j] == 'F':
			fire_q.append([i, j])
		elif maze[i][j] == 'J':
			day_counts[i][j] = 1
			jh_q.append([i, j])

result:int = bfs()

if result == -1:
    print('IMPOSSIBLE')
else:
    print(result)