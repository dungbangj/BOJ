def get_input() -> str:
	return input().strip()

def sort_string(input: str) -> list[int]:
	arr: list[int] = []
	for num in input:
		arr.append(int(num))
	merge_sort(arr, 0, len(arr) - 1)
	return arr

def merge_sort(arr: list[int], left: int, right: int) -> None:
	if left < right:
		mid: int = (left + right) // 2

		merge_sort(arr, left, mid)
		merge_sort(arr, mid + 1, right)

		merge(arr, left, mid, right)

def merge(arr: list[int], left: int, mid: int, right: int) -> None:
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

def print_output(arr: list[int]) -> None:
	result: str = ''
	for num in arr:
		result += str(num)
	print(result[::-1])


def main():
	print_output(sort_string(get_input()))

if __name__ == "__main__":
	main()