[A, B, C] = map(int, input().split(' '))

pig = max(A, B, C)

candy: int = 0

for i in [A, B, C]:
	candy += pig - i

print(candy)