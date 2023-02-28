#include <stdio.h>

int main(void)
{
    int N, a, b;
    scanf("%d", &N);
    for (int i = 0; i < N; i++)
    {
        scanf("%d", &a);
        scanf("%d", &b);
        printf("%d\n", a + b);
    }
}