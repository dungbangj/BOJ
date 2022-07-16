#include <stdio.h>

int	main(void)
{
	int X, a = 1, b = 1, flag1 = 0, flag2 = 1, cnt = 1, real = 1;

	scanf("%d", &X);
	while (1)
	{
		if (X == 1)
		{
			printf("1/1\n");
			return (0);
		}
		if (flag2 == 1 && cnt == b)
		{
			b++;
			flag2 = 0;
			flag1 = 1;
			cnt++;
		}
		else if (flag1 == 1 && cnt == a)
		{
			a++;
			flag1 = 0;
			flag2 = 1;
			cnt++;
		}
		else if (flag1 == 1)
		{
			a++;
			b--;
		}
		else if (flag2 == 1)
		{
			a--;
			b++;
		}
		real++;

		if (X == real)
		{
			printf("%d/%d\n", a, b);
			return (0);
		}
	}

}