def get_input() -> tuple[set[str], set[str]]:
	N, M = map(int, input().split(" "))
	hear_set: set[str] = {input().strip() for _ in range(N)}
	watch_set: set[str] = {input().strip() for _ in range(M)}
	return hear_set, watch_set

def get_intersection(hear_set: set[str], watch_set: set[str]) -> list[str]:
	inter_list: list[str] = list(hear_set & watch_set)
	merge_sort(inter_list, 0, len(inter_list) - 1)
	return inter_list

def merge_sort(arr: list[str], left: int, right: int) -> None:
	if left < right:
		mid: int = (left + right) // 2

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

def print_output(result_list: list[str]) -> None:
	print(len(result_list))
	for result in result_list:
		print(result)

def main() -> None:
	hear_set, watch_set = get_input()
	result_list: list[str] = get_intersection(hear_set, watch_set)
	print_output(result_list)

if __name__ == '__main__':
	main()