def get_input() -> list[int, list[int, str]]:
	N: int = int(input().strip())
	inputs: list[int, list[int, str]] = []
	for i in range(N):
		tmp_input: list[str] = input().split(" ")
		one_input: list[int, str] = [int(tmp_input[0]), tmp_input[1]]
		inputs.append([i, one_input])
	return inputs


def merge_sort(arr: list[int, list[int, str]], left: int, right: int) -> None:
	if left < right:
		mid: int = (left + right) // 2

		merge_sort(arr, left, mid)
		merge_sort(arr, mid + 1, right)

		merge(arr, left, mid, right)

def merge(arr: list[int, list[int, str]], left: int, mid: int, right: int) -> None:
	tmp: list[int, list[int, str]] = []
	i = left
	j = mid + 1

	while i <= mid and j <= right:
		if arr[i][1][0] < arr[j][1][0] or (arr[i][1][0] == arr[j][1][0] and arr[i][0] < arr[j][0]):
			tmp.append([arr[i][0], [arr[i][1][0], arr[i][1][1]]])
			i += 1
		else:
			tmp.append([arr[j][0], [arr[j][1][0], arr[j][1][1]]])
			j += 1

	while i <= mid:
		tmp.append([arr[i][0], [arr[i][1][0], arr[i][1][1]]])
		i += 1

	while j <= right:
		tmp.append([arr[j][0], [arr[j][1][0], arr[j][1][1]]])
		j += 1

	arr[left:right + 1] = tmp

def print_output(arr: list[int, list[int, str]]) -> None:
	for one in arr:
		print(f'{one[1][0]} {one[1][1]}')

def main() -> None:
	inputs: list[int, list[int, str]] = get_input()
	merge_sort(inputs, 0, len(inputs) - 1)
	print_output(inputs)

if __name__ == '__main__':
	main()