n = input()
s = input()

if s[len(s) - 1] == "G":
	print(s[:len(s) - 1])
else:
	print(s + "G")