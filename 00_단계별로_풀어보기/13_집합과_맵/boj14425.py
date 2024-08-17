def get_input() -> list[list[str]]:
	N, M = map(int, input().split(" "))
	S: list[str] = []
	arr: list[str] = []
	for _ in range(N):
		S.append(input().strip())
	
	for _ in range(M):
		arr.append(input().strip())

	return [S, arr]

def count_contains(S: list[str], arr: list[str]) -> int:
	S_set = set(S)
	count: int = 0
	for one_arr in arr:
		if one_arr in S_set:
			count += 1
	return count

def print_output(count: int) -> None:
	print(count)

def main() -> None:
	S, arr = get_input()
	print_output(count_contains(S, arr))

if __name__ == '__main__':
	main()
