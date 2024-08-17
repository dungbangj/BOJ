def get_input() -> list[list[int]]:
	input()
	ref_card: list[int] = list(map(int, input().split(" ")))
	input()
	sg_card: list[int] = list(map(int, input().split(" ")))
	return [ref_card, sg_card]

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

	arr[left: right + 1] = tmp

def binary_search(arr: list[int], target: int) -> bool:
	left, right = 0, len(arr) - 1

	while left <= right:
		mid: int = (left + right) // 2

		if arr[mid] == target:
			return True
		elif arr[mid] > target:
			right = mid - 1
		else:
			left = mid + 1
	return False

def get_result(ref_card: list[int], sg_card: list[int]) -> list[int]:
	result_arr: list[int] = []
	for one in sg_card:
		if binary_search(ref_card, one):
			result_arr.append(1)
		else:
			result_arr.append(0)
	return result_arr

def print_output(result_arr: list[int]) -> None:
	for result_one in result_arr:
		print(result_one, end = " ")

def main() -> None:
	ref_card, sg_card = get_input()
	merge_sort(ref_card, 0, len(ref_card) - 1)
	print_output(get_result(ref_card, sg_card))
	
if __name__ == '__main__':
	main()