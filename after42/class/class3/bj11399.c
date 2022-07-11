#include <stdio.h>
#include <stdlib.h>

int	compare(const void *a, const void *b)
{
	return (*(int *)a - *(int *)b);
}

int	main(void)
{
	int	N, sum = 0, tmp;

	scanf("%d", &N);
	int arr[N];
	for (int i = 0; i < N; i++)
	{
		scanf("%d", &arr[i]);
	}
	qsort(arr, N, sizeof(int), compare);
	for (int i = 0; i < N; i++)
	{
		tmp = 0;
		for (int j = 0; j <= i; j++)
			tmp += arr[j];
		sum += tmp;
	}
	printf("%d\n", sum);
}