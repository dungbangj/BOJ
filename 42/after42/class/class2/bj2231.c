#include <stdio.h>

int main()
{
    int N;

    scanf("%d", &N);
    for (int i = 1; i < N; i++)
    {
        int tmp = i;
        int num = i;

        while (tmp > 0)
        {
            num += tmp % 10;
            tmp /= 10;
        }

        if (num == N)
        {
            printf("%d\n", i);
            N = 0;
            break;
        }
    }

    if (N != 0)
        printf("0");
}