def get_input() -> list[list[int]]:
    N: int = int(input().strip())
    inputs: list[list[int]] = []

    for _ in range(N):
        tmp_input: list[int] = list(map(int, input().split(" ")))
        inputs.append(tmp_input)
    return inputs

def merge_sort(arr: list[list[int]], left: int, right: int) -> None:
    if left < right:
        mid: int = (left + right) // 2

        merge_sort(arr, left, mid)
        merge_sort(arr, mid + 1, right)

        merge(arr, left, mid, right)

def merge(arr: list[list[int]], left: int, mid: int, right: int) -> None:
    tmp: list[list[int]] = []
    i: int = left
    j: int = mid + 1

    while i <= mid and j <= right:
        if arr[i][1] < arr[j][1] or (arr[i][1] == arr[j][1] and arr[i][0] <= arr[j][0]):
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

def print_output(arrs: list[list[int]]) -> None:
    for arr in arrs:
        print(f'{arr[0]} {arr[1]}')

def main():
    arr: list[list[int]] = get_input()
    merge_sort(arr, 0, len(arr) - 1)
    print_output(arr)

if __name__ == '__main__':
    main()
