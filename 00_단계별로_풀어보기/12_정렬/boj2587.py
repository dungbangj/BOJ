def get_input() -> list[int]:
	arr: list[int] = []
	for _ in range(5):
		arr.append(int(input()))
	return arr

def print_output(result) -> None:
	print(result['average'])
	print(result['mid_value'])

def merge_sort(arr, left, right) -> None:
	if left < right:
		mid: int = (left + right) // 2

		merge_sort(arr, left, mid)
		merge_sort(arr, mid + 1, right)
		
		merge(arr, left, mid, right)

def merge(arr, left, mid, right):
	tmp: list[int] = []
	i = left
	j = mid + 1

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

def get_result(arr) -> dict[str, int]:
	return {
		'average': sum(arr) // 5 ,
		'mid_value': arr[2],
	}

def main():
	arr: list[int] = get_input()
	merge_sort(arr, 0, len(arr) - 1)
	print_output(get_result(arr))

if __name__ == "__main__":
	main()