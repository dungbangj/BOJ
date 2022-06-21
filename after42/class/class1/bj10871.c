#include <stdio.h>

int main(void)
{
    int N, X, num, flag = 0;
    scanf("%d", &N);
    scanf("%d", &X);
    for (int i = 0; i < N; i++)
    {
        scanf("%d", &num);
        if (num < X)
        {
            if (flag)
                printf(" ");
            printf("%d", num);
            flag = 1;
        }
    }
    printf("\n");
}