def get_input() -> list[str]:
	n: int = int(input().strip())
	names: list[str] = []

	for _ in range(n):
		names.append(input().split(" ")[0])
	return names

def merge_sort(arr: list[str], left: int, right: int) -> None:
	if left < right:
		mid = (left + right) // 2

		merge_sort(arr, left, mid)
		merge_sort(arr, mid + 1, right)

		merge(arr, left, mid, right)

def merge(arr: list[str], left: int, mid: int, right: int) -> None:
	tmp: list[str] = []
	i: int = left
	j: int = mid + 1

	while i <= mid and j <= right:
		if arr[i] <= arr[j]:
			tmp.append(arr[i])
			i += 1
		else:
			tmp.append(arr[j])
			j += 1
	
	while i <= mid:
		tmp.append(arr[i])
		i += 1
	while j <= right:
		tmp.append(arr[j])
		j += 1

	arr[left:right + 1] = tmp

def get_remains(names: list[str]) -> list[str]:
	stack: list[str] = []
	for name in names:
		if not stack:
			stack.append(name)
		elif stack[-1] == name:
			stack.pop()
		else:
			stack.append(name)
	return stack

def print_output(stack: list[str]) -> None:
	while stack:
		print(stack.pop())

def main() -> None:
	names: list[str] = get_input()
	merge_sort(names, 0, len(names) - 1)
	print_output(get_remains(names))

if __name__ == '__main__':
	main()
