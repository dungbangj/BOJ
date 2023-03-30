n, m = map(int, input().split(' '))

sun = n - 7

if sun <= 0:
	sun = m + 7

print(sun)