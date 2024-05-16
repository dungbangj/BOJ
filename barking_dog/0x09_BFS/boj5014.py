# https://www.acmicpc.net/problem/5014
# 5014번 - 스타트링크

from collections import deque

def bfs(cur_f: int) -> int:
	q: deque[list[int]] = deque()
	q.append([cur_f, 0])
	visited[cur_f] = True

	while q:
		cur_f, count = q.popleft()
		if cur_f == slink_f:
			return count
		for i in [-D, U]:
			next_f = cur_f + i
			if 1 <= next_f <= total_f and not visited[next_f]:
				visited[next_f] = True
				q.append([next_f, count + 1])
	return -1

total_f, cur_f, slink_f, U, D = map(int, input().strip().split())
visited: list[bool] = [False for _ in range(total_f + 1)]

result: int = bfs(cur_f=cur_f)
if result == -1:
	print('use the stairs')
else:
	print(result)