T = int(input())

count = 0
for i in range(T):
	x, y, z = map(int, input().split(' '))
	print(min(x, y, z))
