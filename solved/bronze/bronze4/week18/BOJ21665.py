r, c = map(int, input().split(' '))
arr_origin = ""
arr_next = ""

for i in range(r):
    arr_origin += (input().strip())


input()

for i in range(r):
	arr_next += (input().strip())

count: int = 0
for i in range(r * c):
	if arr_origin[i] != arr_next[i]:
		count += 1

print(r * c - count)