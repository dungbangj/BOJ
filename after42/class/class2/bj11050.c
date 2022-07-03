#include <stdio.h>

int factorial(int a)
{
    if (a == 1 || a == 0)
        return (1);
    return (a * factorial(a - 1));
}

int main(void)
{
    int N, K;
    scanf("%d %d", &N, &K);

    printf("%d\n", (factorial(N) / (factorial(K) * factorial(N - K))));
}