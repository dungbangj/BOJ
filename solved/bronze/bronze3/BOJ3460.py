T = int(input())

for i in range(T):
	bin_num = bin(int(input()))
	new_bin_num = bin_num[::-1]
	for j in range(len(new_bin_num)):
		if new_bin_num[j] == '1':
			print(j, end = " ")
		elif new_bin_num[j] != '0' and new_bin_num[j] != '1':
			break
	print()