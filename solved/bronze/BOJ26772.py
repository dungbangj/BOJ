n = int(input())

arr1 = []
arr2 = []
arr3 = []
arr4 = []
arr5 = []
arr6 = []
arr7 = []
arr8 = []
arr9 = []

def arr_print(arr):
	for i in arr:
		print(i, end = '')
	print()


for i in range(n):
	arr1.append(" @@@   @@@  ")
	arr2.append("@   @ @   @ ")
	arr3.append("@    @    @ ")
	arr4.append("@         @ ")
	arr5.append(" @       @  ")
	arr6.append("  @     @   ")
	arr7.append("   @   @    ")
	arr8.append("    @ @     ")
	arr9.append("     @      ")

arr_print(arr1)
arr_print(arr2)
arr_print(arr3)
arr_print(arr4)
arr_print(arr5)
arr_print(arr6)
arr_print(arr7)
arr_print(arr8)
arr_print(arr9)
