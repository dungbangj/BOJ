#include <stdio.h>

int main(void)
{
	int pri[246913] = {0};

	pri[0] = 1;
	pri[1] = 1;
	for (int k = 2; k < 246913; k++)
	{
		for (int j = k * k; j < 246913; j += k)
		{
			if (j > 246913)
				break;
			pri[j] = 1;
		}
		if (k == 496)
			break;
	}

	int n, count;

	while (1)
	{
		count = 0;
		scanf("%d", &n);
		if (n == 0)
			break;
		for (int i = n + 1; i <= 2 * n; i++)
		{
			if (!pri[i])
				count++;
		}
		printf("%d\n", count);
	}
}