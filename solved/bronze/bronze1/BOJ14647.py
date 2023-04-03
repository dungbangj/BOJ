N, M = map(int, input().split(' '))

arr = [[]] * N

for i in range(N):
	arr[i] = list(input().split(' '))

sum9 = 0
for i in range(N):
	for j in arr[i]:
		for k in j:
			if k == '9':
				sum9 += 1

answer = []

for i in range(N):
	sum = 0
	for j in arr[i]:
		for k in j:
			if k == '9':
				sum += 1
	answer.append(sum)

for i in range(M):
	sum = 0
	j = 0
	while j < N:
		for k in arr[j][i]:
			if k == '9':
				sum += 1
		j += 1
	answer.append(sum)

print(sum9 - max(answer))