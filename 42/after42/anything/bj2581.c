#include <stdio.h>

int	main(void)
{
	int M, N, min = 0, pri[10001] = {0}, sum = 0;

	scanf("%d %d", &M, &N);
	pri[0] = 1;
	pri[1] = 1;
	for (int i = 2; i <= N; i++)
		for (int j = i * i; j <= N; j += i)
			pri[j] = 1;


	for (int i = M; i <= N; i++)
		if (!pri[i])
		{
			if (min == 0)
				min = i;
			sum += i;
		}
	if (min == 0)
		printf("-1\n");
	else
	{
		printf("%d\n", sum);
		printf("%d\n", min);
	}
}