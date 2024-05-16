# https://www.acmicpc.net/problem/7562
# 7562번 - 나이트의 이동
# dx, dy가 늘어난 bfs 문제

from collections import deque

T: int = int(input().strip())

dx: list[int] = [-1, -1, -2, -2, 1, 1, 2, 2]
dy: list[int] = [-2, 2, -1, 1, -2, 2, -1, 1]

def bfs(s_x: int, s_y: int, e_x: int, e_y: int, visited: list[list[bool]]) -> int:
	if [s_x, s_y] == [e_x, e_y]:
		return 0
	q: deque[list[int]] = deque()
	q.append([s_x, s_y])
	visited[s_x][s_y] = True
	count: int = 0

	while q:
		for _ in range(len(q)):
			s_x, s_y = q.popleft()
			for i in range(len(dx)):
				nx, ny = s_x + dx[i], s_y + dy[i]
				if 0 <= nx < I and 0 <= ny < I and not visited[nx][ny]:
					if [nx, ny] == [e_x, e_y]:
						return count + 1
					visited[nx][ny] = True
					q.append([nx, ny])
		count += 1
	return -1

for _ in range(T):
	I: int = int(input().strip())
	board: list[list[int]] = [[0] * I for _ in range(I)]
	s_x, s_y = map(int, input().strip().split())
	e_x, e_y = map(int, input().strip().split())
	visited: list[list[bool]] = [[False for _ in range(I)] for _ in range(I)]
	print(bfs(s_x, s_y, e_x, e_y, visited))