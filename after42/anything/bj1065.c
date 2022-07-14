#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	int N, count = 0;
	int tmp[3], k, tmpi;

	scanf("%d", &N);
	for (int i = 1; i <= N; i++)
	{
		if (i == 1000)
		{
			printf("144\n");
			return (0);
		}
		else if (i >= 1 && i <= 99)
			count++;
		else
		{
			k = 0;
			tmpi = i;
			while (tmpi)
			{
				tmp[k++] = tmpi % 10;
				tmpi /= 10;
			}
			if ((tmp[0] - tmp[1]) == (tmp[1] - tmp[2]))
				count++;
		}
	}
	printf("%d\n", count);
}