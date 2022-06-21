#include <stdio.h>

int main(void)
{
    int num[9];
    int max = 0;
    int maxCount = 0;

    for (int i = 0; i < 9; i++)
    {
        scanf("%d", &num[i]);
        if (num[i] > max)
        {
            max = num[i];
            maxCount = i + 1;
        }
    }

    printf("%d\n%d\n", max, maxCount);
}