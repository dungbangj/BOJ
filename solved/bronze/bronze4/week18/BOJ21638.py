[t1, v1] = map(int, input().split(' '))
[t2, v2] = map(int, input().split(' '))

res: str = ""

if t2 < 0 and v2 >= 10:
	res = "A storm warning for tomorrow! Be careful and stay home if possible!"
elif (t1 > t2):
	res = "MCHS warns! Low temperature is expected tomorrow."
elif (v1 < v2):
	res = "MCHS warns! Strong wind is expected tomorrow."
else:
	res = "No message"

print(res)
