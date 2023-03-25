N = int(input())

mins = 10000
for i in range(0, N):
	A, B = map(int, input().split(' '))
	if A <= B and min(mins, B) == B:
		mins = B

if mins == 10000:
	print(-1)
else:
	print(mins)