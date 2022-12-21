# 1679 숨바꼭질

import sys

input = sys.stdin.readline
N, K = map(int, input().split())
visited = [False] * 100001

print("count", "len(queue)", "queue")

def bfs(N):
    count = 0
    queue = [N]
    while len(queue) > 0:
        for _ in range(len(queue)):
            print(count, len(queue), queue)
            num = queue.pop(0)
            if num == K:
                return count
            if num > 100000 or 0 > num or visited[num] is True:
                continue
            visited[num] = True
            if num > K:
                queue.append(num - 1)
            else:
                queue.append(num + 1)
                queue.append(num - 1)
                queue.append(num * 2)
        count += 1

print(bfs(N))

