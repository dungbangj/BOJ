def get_input() -> tuple[set[int], set[int]]:
	input()
	a_set: set[int] = set(map(int, input().split(" ")))
	b_set: set[int] = set(map(int, input().split(" ")))
	return a_set, b_set

def get_result(a_set: set[int], b_set: set[int]) -> int:
	inter_set: set[int] = a_set & b_set
	return len(a_set) + len(b_set) - 2 * len(inter_set)

def print_output(result: int) -> None:
	print(result)

def main() -> None:
	a_set, b_set = get_input()
	print_output(get_result(a_set, b_set))

if __name__ == '__main__':
	main()