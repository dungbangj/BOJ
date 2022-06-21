#include <stdio.h>

int main(void)
{
    int N;
    scanf("%d", &N);

    int min = 1000001, max = -1000001, num;
    for (int i = 0; i < N; i++)
    {
        scanf("%d", &num);
        if (num < min)
            min = num;
        if (num > max)
            max = num;
    }
    printf("%d %d\n", min, max);
}