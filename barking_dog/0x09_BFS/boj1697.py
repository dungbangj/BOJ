# https://www.acmicpc.net/problem/1697
# 1697번 - 숨바꼭질
# BFS를 통해서 세 가지 계산을 반복적으로 진행하다가 목표값이 나오면 그만하는 문제

from collections import deque

def bfs(n: int, k: int) -> int:
	if n == k:
		return 0
	q: deque[int] = deque([n])
	visited: set[int] = set([n])
	count = 0

	while q:
		for _ in range(len(q)):
			cur_num: int = q.popleft()

			for next_num in [cur_num - 1, cur_num + 1, cur_num * 2]:
				if next_num == k:
					return count + 1
				if 0 <= next_num <= 100000 and next_num not in visited:
					visited.add(next_num)
					q.append(next_num)
		count += 1
	return 0

input_nk: list[int] = list(map(int, input().strip().split()))
n: int = input_nk[0]
k: int = input_nk[1]

print(bfs(n = n, k = k))
