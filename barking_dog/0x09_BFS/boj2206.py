from collections import deque
from typing import Any

def bfs():
    q: deque[Any] = deque()
    q.append((0, 0, False, 1))
    visited: list[list[list[bool]]] = [[[False, False] for _ in range(M)] for _ in range(N)]
    visited[0][0][0] = True  

    while q:
        x, y, broken, dist = q.popleft()
        if x == N - 1 and y == M - 1:
            return dist
        
        for dx, dy in [(1, 0), (-1, 0), (0, 1), (0, -1)]:
            nx, ny = x + dx, y + dy
            if 0 <= nx < N and 0 <= ny < M:
                if maze[nx][ny] == 0 and not visited[nx][ny][broken]:
                    visited[nx][ny][broken] = True
                    q.append((nx, ny, broken, dist + 1))
                elif maze[nx][ny] == 1 and not broken and not visited[nx][ny][1]:
                    visited[nx][ny][1] = True
                    q.append((nx, ny, True, dist + 1))

    return -1

N, M = map(int, input().strip().split())
maze: list[list[int]] = [[int(i) for i in input().strip()] for _ in range(N)]

print(bfs())
