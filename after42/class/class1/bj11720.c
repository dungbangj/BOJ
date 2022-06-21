#include <stdio.h>
#include <string.h>

int main(void)
{
    int N, sum = 0, len;
    char num[100];
    scanf("%d", &N);
    scanf("%s", num);
    len = strlen(num);
    for (int i = 0; i < len; i++)
    {
        sum += num[i] - '0';
    }
    printf("%d\n", sum);
}