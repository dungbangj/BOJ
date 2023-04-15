start = list(map(int, input().split(':')))
end = list(map(int, input().split(':')))

start_sec = start[2] + start[1] * 60 + start[0] * 3600
end_sec = end[2] + end[1] * 60 + end[0] * 3600

res = 0

if start_sec > end_sec:
	res = end_sec + 24 * 3600 - start_sec
else:
	res = end_sec - start_sec

arr = []

arr.append(int(res // 3600))
res %= 3600
arr.append(int(res // 60))
res %= 60
arr.append(res)

if arr[0] == 0 and arr[1] == 0 and arr[2] == 0:
	print("24:00:00")
	exit()

if arr[0] < 10:
	print(f"0{arr[0]}:", end = '')
else:
	print(f"{arr[0]}:", end = '')

if arr[1] < 10:
	print(f"0{arr[1]}:", end = '')
else:
	print(f"{arr[1]}:", end = '')

if arr[2] < 10:
	print(f"0{arr[2]}", end = '')
else:
	print(f"{arr[2]}", end = '')

print()