a = list(map(int, input().split(' ')))
b = list(map(int, input().split(' ')))
c = list(map(int, input().split(' ')))
d = list(map(int, input().split(' ')))
e = list(map(int, input().split(' ')))

score = []

def sums(arr):
	sum = 0
	for i in arr:
		sum += i
	return sum


score.append(sums(a))
score.append(sums(b))
score.append(sums(c))
score.append(sums(d))
score.append(sums(e))


max_i = 0
max_val = 0

for i in range(len(score)):
	if score[i] > max_val:
		max_val = score[i]
		max_i = i

print(f"{max_i + 1} {max_val}")