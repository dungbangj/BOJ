#include <stdio.h>
#include <string.h>

int dial(char n)
{
	switch (n)
	{
	case 'A':
	case 'B':
	case 'C':
		return 2;
	case 'D':
	case 'E':
	case 'F':
		return 3;
	case 'G':
	case 'H':
	case 'I':
		return 4;
	case 'J':
	case 'K':
	case 'L':
		return 5;
	case 'M':
	case 'N':
	case 'O':
		return 6;
	case 'P':
	case 'Q':
	case 'R':
	case 'S':
		return 7;
	case 'T':
	case 'U':
	case 'V':
		return 8;
	case 'W':
	case 'X':
	case 'Y':
	case 'Z':
		return 9;
	default:
		return 0;
	}
}

int main(void)
{
	char	arr[15];

	scanf("%s", arr);
	int len = strlen(arr), sum = 0;
	for (int i = 0; i < len; i++)
	{
		sum += dial(arr[i]);
	}
	printf("%d\n", sum + len);
}