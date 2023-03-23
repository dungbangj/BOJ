input_str = input()

res: str = ""
i: int = 0
while i < len(input_str):
	res += input_str[i]
	i += ord(input_str[i]) - 64

print(res)