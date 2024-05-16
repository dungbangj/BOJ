# https://www.acmicpc.net/problem/2178
# 2178번 - 미로탐색
# bfs를 활용해서 이미 지나간 칸은 0으로 만든다. 새로운 이중 리스트에 해당 칸까지 왔을 때의 count를 저장한다.

from collections import deque

def bfs(x: int, y: int) -> None:
	maze[x][y] = 0
	q: deque[list[int]] = deque()
	q.append([x, y])

	while q:
		x, y = q.popleft()

		for i in range(len(dx)):
			nx: int = x + dx[i]
			ny: int = y + dy[i]
			
			if 0 <= nx < n and 0 <= ny < m and maze[nx][ny] == 1:
				q.append([nx, ny])	
				maze[nx][ny] = 0
				result_maze[nx][ny] = result_maze[x][y] + 1
	

input_nm: list[int] = list(map(int, input().split()))
n: int = input_nm[0]
m: int = input_nm[1]
dx: list[int] = [1, -1, 0, 0]
dy: list[int] = [0, 0, 1, -1]
maze: list[list[int]] = [[i for i in map(int, input())] for _ in range(n)]
result_count: int = 0
result_maze: list[list[int]] = [[0] * m for _ in range(n)]
result_maze[0][0] = 1


bfs(x = 0, y = 0)
# print(maze)
# print(result_maze)
print(result_maze[n - 1][m - 1])
