#include <stdio.h>

int main(void)
{
	int arr[3], max = 0;

	for (int i = 0; i < 3; i++)
	{
		scanf("%d", &arr[i]);
		if (max < arr[i])
			max = arr[i];
	}
	if (arr[0] == arr[1] && arr[1] == arr[2])
		printf("%d\n", 10000 + arr[0] * 1000);
	else if (arr[0] != arr[1] && arr[1] != arr[2] && arr[2] != arr[0])
		printf("%d\n", max * 100);
	else
	{
		if (arr[0] == arr[1])
			printf("%d\n", 1000 + arr[0] * 100);
		else if (arr[0] == arr[2])
			printf("%d\n", 1000 + arr[0] * 100);
		else if (arr[1] == arr[2])
			printf("%d\n", 1000 + arr[1] * 100);
	}
	return (0);
}