N = int(input())
count = 0
for i in range(N):
	D = input()
	day = int(D[2:len(D)])
	if day <= 90:
		count += 1

print(count)