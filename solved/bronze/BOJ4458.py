N = int(input())
s = []
for i in range(N):
	s.append(input())
S = []
for i in range(N):
	if ord(s[i][0]) <= 90:
		S.append(s[i])
		continue
	S.append(chr(ord(s[i][0]) - 32) + s[i][1:])

for i in range(N):
	print(S[i])