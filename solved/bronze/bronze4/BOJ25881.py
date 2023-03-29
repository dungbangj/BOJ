A, B = map(int, input().split(' '))

T = int(input())

for i in range(T):
	used = int(input())
	total = 0
	if used > 1000:
		total = 1000 * A + (used - 1000) * B
	else:
		total = used * A
	print("{} {}".format(used, total))