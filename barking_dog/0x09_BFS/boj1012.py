# https://www.acmicpc.net/problem/1012
# 1012번 - 유기농 배추
import sys
from collections import deque

input = sys.stdin.read

def bfs(farm: list[list[int]], x: int, y: int) -> None:
	q: deque[list[int]] = deque()
	q.append([x, y])
	farm[x][y] = 0

	while q:
		pop_x, pop_y = q.popleft()
		for dx, dy in [[1, 0], [-1, 0], [0, 1], [0, -1]]:
			nx, ny = pop_x + dx, pop_y + dy
			if 0 <= nx < n and 0 <= ny < m and farm[nx][ny] == 1:
				q.append([nx, ny])
				farm[nx][ny] = 0

		

input_data: list[str] = sys.stdin.read().split()
index = 0
T: int = int(input_data[index])
index += 1

for _ in range(T):
	m = int(input_data[index])
	n = int(input_data[index + 1])
	k = int(input_data[index + 2])
	index += 3

	ones: list[list[int]] = []
	farm: list[list[int]] = [[0] * m for _ in range(n)]
	for _ in range(k):
		x: int = int(input_data[index + 1])
		y: int = int(input_data[index])
		farm[x][y] = 1
		index += 2
		ones.append([x, y])
	count: int = 0

	for x, y in ones:
		if farm[x][y] == 1:
			count += 1
			bfs(farm = farm, x = x, y = y)

	# print(farm)
	print(count)
