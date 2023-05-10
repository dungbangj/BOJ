n = int(input())

def common_feed(j):
	if j >= 0 and j <= 2:
		return tmp_pig[j + 3]
	else:
		return tmp_pig[j - 3]

def copy_arr(tmp_pig, pig_ate):
	for i in range(6):
		tmp_pig[i] = pig_ate[i]
	return tmp_pig

for i in range(n):
	food = int(input())
	pig_ate = list(map(int, input().split(' ')))
	tmp_pig = [0] * 6 
	day = 1
	sumi = 0
	for j in pig_ate:
		sumi += j
	if food - sumi < 0:
		print(day)
		continue
	while True:
		tmp_pig = copy_arr(tmp_pig, pig_ate)
		day += 1
		tmp_food = food
		for j in range(len(tmp_pig)):
			if j == 0:
				ate = (tmp_pig[5] + tmp_pig[1] + tmp_pig[3] + tmp_pig[0])
				pig_ate[0] = ate
			elif j == 5:
				ate = (tmp_pig[4] + tmp_pig[0] + tmp_pig[2] + tmp_pig[5])
				pig_ate[5] = ate
			else:
				ate = (tmp_pig[j - 1] + tmp_pig[j + 1] + common_feed(j) + tmp_pig[j])
				pig_ate[j] = ate
		sum = 0
		for j in pig_ate:
			sum += j
		if food - sum < 0:
			break
	print(day)
