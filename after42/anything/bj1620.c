#include <stdio.h>
#include <stdlib.h>

typedef struct pokemon
{
	char	*name;
	int		idx;
} tpok;

int compare(const void *a, const void *b)
{
	tpok *x = (tpok *)a;
	tpok *y = (tpok *)b;

	if (x->name)
	return (*(int *)a - *(int *)b);
}



int main(void)
{
	int N, M;
	scanf("%d %d", &N, &M);

	tpok *list;
	char ques[5][20];
	for (int i = 0; i < N; i++)
	{
		scanf("%s", list[i].name);
		list[i].idx = i + 1;
	}
	qsort(list, N, list[0].name, compare);
	for (int i = 0; i < M; i++)
		scanf("%s", ques[i]);


}