def get_input() -> list[int]:
	arr: list[int] = []
	N: int = int(input())
	for _ in range(N):
		arr.append(int(input()))
	return arr
	
def print_output(arr) -> None:
	for i in arr:
		print(i)

def merge_sort(arr, left, right) -> None:
	if left < right:
		mid: int = (left + right) // 2

		merge_sort(arr, left, mid)
		merge_sort(arr, mid + 1, right)

		merge(arr, left, mid, right)

def merge(arr, left, mid, right) -> None:
	tmp_arr: list[int] = []
	i: int = left
	j: int = mid + 1

	while i <= mid and j <= right:
		if arr[i] <= arr[j]:
			tmp_arr.append(arr[i])
			i += 1
		else:
			tmp_arr.append(arr[j])
			j += 1
	
	while i <= mid:
		tmp_arr.append(arr[i])
		i += 1
	
	while j <= right:
		tmp_arr.append(arr[j])
		j += 1

	arr[left:right + 1] = tmp_arr

def main():
	input_arr: list[int] = get_input()
	merge_sort(input_arr, 0, len(input_arr) - 1)
	print_output(input_arr)

if __name__ == "__main__":
	main()