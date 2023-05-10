n = int(input())

for i in range(n):
	p, t = map(int, input().split(' '))
	die = t // 7
	born = t // 4
	p = p - die + born
	print(p)