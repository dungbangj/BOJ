# https://www.acmicpc.net/problem/7569
# 7569번 - 토마토

from collections import deque

def bfs() -> int:
	count = 0

	while q:
		q_len = len(q)

		for _ in range(q_len):
			z, x, y = q.popleft()
			for i in range(len(dx)):
				nx, ny, nz = x + dx[i], y + dy[i], z + dz[i]
				if 0 <= nx < N and 0 <= ny < M and 0 <= nz < H and boxes[nz][nx][ny] == 0:
					boxes[nz][nx][ny] = 1
					q.append([nz, nx, ny])
		count += 1
	return count

M, N, H = map(int, input().strip().split())
boxes: list[list[list[int]]] = []
dx: list[int] = [1, -1, 0, 0, 0, 0]
dy: list[int] = [0, 0, 1, -1, 0, 0]
dz: list[int] = [0, 0, 0, 0, 1, -1]
q: deque[list[int]] = deque()

for _ in range(H):
	one_box: list[list[int]] = []
	for _ in range(N):
		one_line: list[int] = list(map(int, input().strip().split()))
		one_box.append(one_line)
	boxes.append(one_box)


for h in range(H):
	for n in range(N):
		for m in range(M):
			if boxes[h][n][m] == 1:
				q.append([h, n, m])
# print(q)
result_count: int = bfs() - 1

for h in range(H):
	for n in range(N):
		for m in range(M):
			if boxes[h][n][m] == 0:
				print(-1)
				exit()

print(result_count)