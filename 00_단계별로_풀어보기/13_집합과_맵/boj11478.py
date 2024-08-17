def get_input() -> str:
	return input().strip()

def get_parts(input: str) -> set[str]:
	parts: set[str] = set()

	for i in range(len(input)):
		for j in range(i, len(input)):
			parts.add(input[i:j + 1])
	return parts

def print_output(parts: set[str]) -> None:
	print(len(parts))

def main() -> None:
	print_output(get_parts(get_input()))

if __name__ == '__main__':
	main()