A, B = map(int, input().split(' '))
C, D = map(int, input().split(' '))

answer = []

answer.append(A / C + B / D)
answer.append(C / D + A / B)
answer.append(D / B + C / A)
answer.append(B / A + D / C)

i = answer[0]
res = 0
for j in range(len(answer)):
	if answer[j] > i:
		res = j
		i = answer[j]

print(res)