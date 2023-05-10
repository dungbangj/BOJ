N = int(input())

side_dot = 2

for i in range(1, N + 1):
	side_dot += side_dot - 1

print(side_dot * side_dot)
