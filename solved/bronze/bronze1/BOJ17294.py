num = input()
flag = 0
if len(num) == 1:
	print("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!")
else:
	diff = int(num[0]) - int(num[1])
	for i in range(1, len(num)):
		if diff != int(num[i - 1]) - int(num[i]):
			flag = 1
	if flag == 0:
		print("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!")
	else:
		print("흥칫뿡!! <(￣ ﹌ ￣)>")