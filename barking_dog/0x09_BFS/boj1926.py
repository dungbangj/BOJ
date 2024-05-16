# https://www.acmicpc.net/problem/2178
# 1926번 - 그림
# bfs를 사용해 지도에서 1을 찾으면 dx, dy로 동서남북을 탐색하여 주변 1을 찾고, 해당 칸을 0으로 만드는 문제

from collections import deque

def bfs(x: int, y: int) -> int:
	paper[x][y] = 0
	q: deque[list[int]] = deque()
	q.append([x, y])
	w: int = 1

	while q:
		x, y = q.popleft()
		for i in range(len(dx)):
			nx: int = x + dx[i]
			ny: int = y + dy[i]

			if 0 <= nx < n and 0 <= ny < m and paper[nx][ny] == 1:
				paper[nx][ny] = 0
				q.append([nx, ny])
				w += 1
	return w

input_nm: list[int] = list(map(int, input().split()))

n: int = input_nm[0]
m: int = input_nm[1]

dx: list[int] = [1, -1, 0, 0]
dy: list[int] = [0, 0, 1, -1]

paper: list[list[int]] = [list(map(int, input().split())) for _ in range(n)]
result_count: int = 0
result_width: int = 0

for i in range(n):
	for j in range(m):
		if paper[i][j] == 1:
			result_count += 1
			result_width = max(bfs(x = i, y = j), result_width)

print(result_count)
print(result_width)