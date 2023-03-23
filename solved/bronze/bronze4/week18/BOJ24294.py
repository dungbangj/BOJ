w1: int = int(input())
h1: int = int(input())
w2: int = int(input())
h2: int = int(input())

res: int = 0

if w1 != w2:
	res = (h1 + h2) * 2 + w1 + w2 + (max(w1, w2) - min(w1, w2) - 1) + 5
elif w1 == w2:
	res = (h1 + h2) * 2 + (w1 + w2) + 4

print(res)