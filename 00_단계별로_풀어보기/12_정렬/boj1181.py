def	get_input() -> list[str]:
	N: int = int(input().strip())
	inputs: list[str] = []

	for _ in range(N):
		inputs.append(input().strip())
	return inputs

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
		if len(arr[i]) < len(arr[j]) or ((len(arr[i]) == len(arr[j]) and arr[i] < arr[j])):
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

def print_output(arr: list[str]) -> None:
	tmp = arr[0]
	print(tmp)
	for i in range(1, len(arr)):
		if arr[i] == tmp:
			continue
		print(arr[i])
		tmp = arr[i]

def main():
	arr: list[str] = get_input()
	merge_sort(arr, 0, len(arr) - 1)
	print_output(arr)

if __name__ == '__main__':
	main()