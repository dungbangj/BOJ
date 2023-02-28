#include <stdio.h>

int main(void)
{
    int sum = 0;
    int num[5];
    for (int i = 0; i < 5; i++)
    {
        scanf("%d", &num[i]);
        sum += num[i] * num[i];
    }
    printf("%d\n", sum % 10);
}