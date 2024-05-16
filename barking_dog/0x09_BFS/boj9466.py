# https://www.acmicpc.net/problem/9466
# 2466번 - 텀 프로젝트
import sys

sys.setrecursionlimit(10**6)

def dfs(s: int, cycle: list[int], dest: list[int], result: list[int]) -> None:
	teamed[s] = True
	cycle.append(s)
	next_s: int = dest[s]

	if teamed[next_s]:
		if next_s in cycle:
			result += cycle[cycle.index(next_s):]
		return
	else:
		dfs(next_s, cycle, dest, result)

T = int(input().strip())

for _ in range(T):
	n = int(input().strip())
	dest: list[int] = [x - 1 for x in list(map(int, input().strip().split()))]
	teamed: list[bool] = [False for _ in range(n)]
	result: list[int] = []

	for i in range(n):
		if not teamed[i]:
			cycle: list[int] = []
			dfs(i, cycle, dest, result)
	print(n - len(result))

