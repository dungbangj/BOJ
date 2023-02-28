#include <stdio.h>
#include <string.h>

int main(void)
{
	char arr[100];

	scanf("%s", arr);
	int len = strlen(arr), sum = 0;
	for (int i = 0; i < len; i++)
	{
		if (arr[i] == 'c' && (arr[i + 1] == '=' || arr[i + 1] == '-'))
		{
			i++;
			sum++;
		}
		else if (arr[i] == 'd' && arr[i + 1] == 'z' && arr[i + 2] == '=')
		{
			i += 2;
			sum++;
		}
		else if (arr[i] == 'd' && arr[i + 1] == '-')
		{
			i++;
			sum++;
		}
		else if ((arr[i] == 'l' || arr[i] == 'n') && arr[i + 1] == 'j')
		{
			i++;
			sum++;
		}
		else if ((arr[i] == 's' || arr[i] == 'z') && arr[i + 1] == '=')
		{
			i++;
			sum++;
		}
		else
			sum++;
	}
	printf("%d\n", sum);
}