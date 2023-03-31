n = int(input())

ball = 1

for i in range(n):
	x, y = map(int, input().split(' '))
	if x == ball:
		ball = y
	elif y == ball:
		ball = x
print(ball)