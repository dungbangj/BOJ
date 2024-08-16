import sys
import array

def get_input() -> array.array:
    arr = array.array('i', [0] * 10001)
    N = int(sys.stdin.readline().strip())
    for _ in range(N):
        arr[int(sys.stdin.readline().strip())] += 1
    return arr

def count_sort(arr: array.array) -> None:
    for num in range(10001):
        if arr[num] > 0:
            for _ in range(arr[num]):
                print(num)

def main():
    input_arr = get_input()
    count_sort(input_arr)

if __name__ == "__main__":
    main()
