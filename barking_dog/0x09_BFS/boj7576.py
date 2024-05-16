# https://www.acmicpc.net/problem/7576
# 7576번 - 토마토
# deque에 담겨있는 익은 토마토가 여러 개일 때, 해당 토마토만 bfs를 돌리는 것이 중요했던 문제이다.
# 해당 deque의 길이를 먼저 구하고, 해당 길이만큼만 bfs를 진행시키면서 해당 deque에 익은 토마토를 담는다.

from collections import deque

def bfs(q: deque[list[int]]) -> int:
    count: int = 0

    while q:
        q_len: int = len(q)

        for _ in range(q_len):
            rotted_xy: list[int] = q.popleft()
            x: int = rotted_xy[0]
            y: int = rotted_xy[1]

            for i in range(len(dx)):
                nx: int = x + dx[i]
                ny: int = y + dy[i]

                if 0 <= nx < n and 0 <= ny < m and box[nx][ny] == 0:
                    box[nx][ny] = 1
                    q.append([nx, ny])
        
        count += 1

    return count

input_nm: list[int] = list(map(int, input().split()))
m: int = input_nm[0]
n: int = input_nm[1]
dx: list[int] = [1, -1, 0, 0]
dy: list[int] = [0, 0, 1, -1]
box: list[list[int]] = [list(map(int, input().split())) for _ in range(n)]
q: deque[list[int]] = deque()

for i in range(n):
    for j in range(m):
        if box[i][j] == 1:
            q.append([i, j])

result_count: int = bfs(q = q) - 1
zero_flag: bool = False

for i in range(n):
    for j in range(m):
        if box[i][j] == 0:
            zero_flag = True

if zero_flag:
    print(-1)
else:
    print(result_count)
