#include "stdio.h"

int main(void)
{
	int h, m, min, sumh, summ;

	scanf("%d %d %d", &h, &m, &min);

	summ = (m + min) % 60;
	sumh = (m + min) / 60 + h;

	if (sumh > 23)
		sumh -= 24;

	printf("%d %d\n", sumh, summ);
}