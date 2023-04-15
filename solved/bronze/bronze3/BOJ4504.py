n = int(input())
nums = []
while True:
	num = int(input())
	if num == 0:
		break
	nums.append(num)

for i in nums:
	if i % n == 0:
		print(f"{i} is a multiple of {n}.")
	else:
		print(f"{i} is NOT a multiple of {n}.")
