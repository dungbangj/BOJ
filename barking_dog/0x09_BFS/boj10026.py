# https://www.acmicpc.net/problem/10026
# 10026번 - 적록색약
# 색을 기준으로 탐색한 칸은 visited로 확인하여 count를 구하는 문제

from collections import deque

def make_red_to_green(areas: list[list[str]]) -> list[list[str]]:
	tmp_area: list[list[str]] = []
	for i in range(len(areas)):
		one_line: list[str] = areas[i].copy()
		for j in range(len(one_line)):
			if one_line[j] == 'R':
				one_line[j] = 'G'
		tmp_area.append(one_line)
	return tmp_area

def bfs(x: int, y: int, color: str, areas: list[list[str]]) -> None:
	q: deque[list[int]] = deque()
	q.append([x, y])

	while q:
		x, y = q.popleft()
		for i in range(len(dx)):
			nx, ny = x + dx[i], y + dy[i]
			if 0 <= nx < len(areas) and 0 <= ny < len(areas[0]) and not visited[nx][ny] and areas[nx][ny] == color:
				visited[nx][ny] = True
				q.append([nx, ny])
				
def search(areas: list[list[str]]) -> int:
	result_count: int = 0

	for i in range(len(areas)):
		for j in range(len(areas[i])):
			if not visited[i][j]:
				result_count += 1
				bfs(x = i, y = j, color=areas[i][j], areas=areas)
	return result_count

N: int = int(input().strip())
areas: list[list[str]] = [[i for i in input().strip()] for _ in range(N)]
areas_for_rgblind: list[list[str]] = make_red_to_green(areas=areas)
visited: list[list[bool]] = [[False for _ in range(len(areas[0]))] for _ in range(N)]
dx: list[int] = [1, -1, 0, 0]
dy: list[int] = [0, 0, 1, -1]
count: int = search(areas=areas)
visited: list[list[bool]] = [[False for _ in range(len(areas[0]))] for _ in range(N)]

count_blind: int = search(areas = areas_for_rgblind)

print(count, count_blind)