# https://www.acmicpc.net/problem/5427
# 5427번 - 불
# 불이 먼저 번져야하는 bfs 문제

from collections import deque

def bfs(maze: list[list[str]]) -> int:
	fire_q: deque[list[int]] = deque()
	human_q: deque[list[int]] = deque()
	
	for i in range(len(maze)):
		for j in range(len(maze[i])):
			if maze[i][j] == '*':
				fire_q.append([i, j])
			if maze[i][j] == '@':
				human_q.append([i, j])
				if i == 0 or i == h-1 or j == 0 or j == w-1:
					return -1
	count: int = 0

	while human_q:
		for _ in range(len(fire_q)):
			f_x, f_y = fire_q.popleft()
			for i in range(len(dx)):
				n_f_x, n_f_y = f_x + dx[i], f_y + dy[i]
				if 0 <= n_f_x < len(maze) and 0 <= n_f_y < len(maze[0]) and maze[n_f_x][n_f_y] == '.':
					maze[n_f_x][n_f_y] = '*'
					fire_q.append([n_f_x, n_f_y])
		
		for _ in range(len(human_q)):
			h_x, h_y = human_q.popleft()
			for i in range(len(dx)):
				n_h_x, n_h_y = h_x + dx[i], h_y + dy[i]
				if 0 <= n_h_x < len(maze) and 0 <= n_h_y < len(maze[0]) and maze[n_h_x][n_h_y] == '.':
					maze[n_h_x][n_h_y] = '@'
					if n_h_x == 0 or n_h_x == len(maze) - 1 or n_h_y == 0 or n_h_y == len(maze[0]) - 1:
						return count
					human_q.append([n_h_x, n_h_y])
		count += 1
	return -2

T: int = int(input().strip())
dx: list[int] = [1, -1, 0, 0]
dy: list[int] = [0, 0, 1, -1]

for _ in range(T):
	w, h = map(int, input().strip().split())
	maze: list[list[str]] = [[i for i in input().strip()] for _ in range(h)]
	result_count = bfs(maze)
	if result_count == -2:
		print('IMPOSSIBLE')
	else:
		print(result_count + 2)

