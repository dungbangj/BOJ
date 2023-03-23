T: int = int(input())

res: str = ""
for i in range(T):
	a, b = map(int, input().split(' '))
	if a <= 2 and b <= 1:
		res += "Yes\n"
	elif a <= 1 and b <= 2:
		res += "Yes\n"
	else:
		res += "No\n"

print(res)