def get_input() -> list[int]:
	input()
	return list(map(int, input().split()))

def count_arr(arr: list[int]) -> list[int]:
	set_arr = set(arr)
	sorted_arr = merge_sort(list(set_arr))
	rank_dict = {value: idx for idx, value in enumerate(sorted_arr)}
	result_arr = [rank_dict[value] for value in arr]
	return result_arr

def merge_sort(arr: list[int]) -> list[int]:
	if len(arr) <= 1:
		return arr

	mid = len(arr) // 2
	left_half = merge_sort(arr[:mid])
	right_half = merge_sort(arr[mid:])

	return merge(left_half, right_half)

def merge(left: list[int], right: list[int]) -> list[int]:
	sorted_arr = []
	i = j = 0

	while i < len(left) and j < len(right):
		if left[i] <= right[j]:
			sorted_arr.append(left[i])
			i += 1
		else:
			sorted_arr.append(right[j])
			j += 1

	sorted_arr.extend(left[i:])
	sorted_arr.extend(right[j:])

	return sorted_arr

def print_output(arr: list[int]) -> None:
	print(" ".join(map(str, arr)))

def main() -> None:
	inputs: list[int] = get_input()
	print_output(count_arr(inputs))

if __name__ == '__main__':
	main()
