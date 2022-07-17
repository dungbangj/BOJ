#include <stdio.h>

int main(void)
{
	int	N, num = 2, tmpN;

	scanf("%d", &N);
	tmpN = N;

	while (num <= tmpN)
	{
		while (N % num == 0)
		{
			printf("%d\n", num);
			N /= num;
		}
		num++;
	}
}