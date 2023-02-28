#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	int T, pri[20001] = {0}, flag = 0, n, f, l, min = 99999, minf, minl;
	scanf("%d", &T);

	pri[0] = 1;
	pri[1] = 1;
	for (int i = 2; i < 20001; i++)
	{
		for (int j = i * i; j < 20001; j += i)
		{
			if (j > 20000)
			{
				flag = 1;
				break;
			}
			pri[j] = 1;
		}
		if (flag)
		{
			flag = 0;
			break;
		}
	}

	for (int i = 0; i < T; i++)
	{
		scanf("%d", &n);
		f = 2;
		l = n - f;
		minf = 0;
		minl = 0;
		min = 99999;
		while (f <= l)
		{
			if (!pri[f] && !pri[l])
			{
				if (abs(f - l) < min)
				{
					minf = f;
					minl = l;
					min = abs(f - l);
				}
			}
			f++;
			l--;
		}
		printf("%d %d\n", minf, minl);
	}
}