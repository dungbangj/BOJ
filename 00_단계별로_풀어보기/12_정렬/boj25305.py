from typing import Any

def get_input() -> dict[str, Any]:
	cut_rank: int = int(input().split(" ")[1])
	arr: list[int] = list(map(int, input().split(" ")))
	return {
		'cut_rank': cut_rank,
		'arr': arr,
	}

def print_output(cut_line) -> None:
	print(cut_line)

def merge_sort(arr, left, right) -> None:
	if left < right:
		mid = (left + right) // 2

		merge_sort(arr, left, mid)
		merge_sort(arr, mid + 1, right)

		merge(arr, left, mid, right)

def merge(arr, left, mid, right):
	tmp: list[int] = []
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

def get_cut_line(input_dict) -> int:
	cut_rank: int = input_dict['cut_rank']
	arr: list[int] = input_dict['arr']

	merge_sort(arr, 0, len(arr) - 1)
	return arr[cut_rank * -1]

def main():
	input_dict: dict[str, Any] = get_input()
	cut_line = get_cut_line(input_dict)
	print_output(cut_line)

if __name__ == "__main__":
	main()

