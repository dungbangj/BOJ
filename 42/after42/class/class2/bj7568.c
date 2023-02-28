#include <stdio.h>

int main(void)
{
    int N, k = 0;

    int x[50], y[50];

    scanf("%d", &N);
    for (int i = 0; i < N; i++)
        scanf("%d %d", &x[i], &y[i]);

    for (int i = 0; i < N; i++)
    {
        k = 0;
        for (int j = 0; j < N; j++)
        {
            if (x[i] < x[j] && y[i] < y[j])
                k++;
        }
        printf("%d\n", k + 1);
    }
}