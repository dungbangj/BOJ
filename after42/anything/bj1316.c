#include <stdio.h>
#include <string.h>

int main(void)
{
	int N;
	int len, k = 0, flag;
	scanf("%d", &N);
	for (int i = 0; i < N; i++)
	{
		char arr[100];
		int tmp[26] = {0};
		flag = 0;
		scanf("%s", arr);
		len = strlen(arr);
		for (int j = 0; j < len; j++)
		{
			tmp[arr[j] - 'a']++;
			if (tmp[arr[j] - 'a'] > 1)
			{
				if (arr[j - 1] != arr[j])
				{
					flag = 1;
					break ;
				}
			}
		}
		if (flag == 0)
			k++;
	}
	printf("%d\n", k);
}