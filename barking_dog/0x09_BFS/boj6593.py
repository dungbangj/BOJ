# https://www.acmicpc.net/problem/6593
# 6593번 - 상법 빌딩

from collections import deque

df = [1, -1, 0, 0, 0, 0]
dh = [0, 0, 1, -1, 0, 0]
dw = [0, 0, 0, 0, 1, -1]

def bfs(s: list[int], e: list[int], building: list[list[list[str]]]) -> int:
	q: deque[list[int]] = deque()
	q.append([s[0], s[1], s[2]])
	count = 0

	while q:
		for _ in range(len(q)):
			f, h, w = q.popleft()
			for i in range(6):
				nf, nh, nw = f + df[i], h + dh[i], w + dw[i]
				if 0 <= nf < len(building) and 0 <= nh < len(building[0]) and 0 <= nw < len(building[0][0]):
					if building[nf][nh][nw] == '.':
						q.append([nf, nh, nw])
						building[nf][nh][nw] = 'S'
					if building[nf][nh][nw] == 'E':
						return count + 1
		count += 1
	return -1

while True:
	L, R, C = map(int, input().strip().split())
	if L + R + C == 0:
		break

	building: list[list[list[str]]] = []

	for f in range(L):
		floor: list[list[str]] = []
		for h in range(R):
			line: list[str] = [i for i in input().strip()]
			floor.append(line)
		building.append(floor)
		input()
	start_info: list[int] = []
	end_info: list[int] = []

	for f in range(len(building)):
		for h in range(len(building[0])):
			for w in range(len(building[0][0])):
				if building[f][h][w] == 'S':
					start_info = [f, h, w]
				if building[f][h][w] == 'E':
					end_info = [f, h, w]
	result: int = bfs(start_info, end_info, building)
	if result == -1:
		print('Trapped!')
	else:
		print('Escaped in', result, 'minute(s).')
