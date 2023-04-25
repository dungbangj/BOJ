N = int(input())

S = input()

def check_right(s1, s2):
	count = 0
	for i in range(len(s1)):
		if s1[i] != s2[i]:
			count += 1
	return count

ans = []
count = 0
for i in range(1, len(S)):
	S1 = S[:i]
	S2 = S[len(S) - i:]
	# print(S1, S2)
	if check_right(S1, S2) == 1:
		count += 1

if count == 1 or (count != 0 and S[0] != S[1]):
	print("YES")
else:
	print("NO")
