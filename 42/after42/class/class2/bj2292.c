#include <stdio.h>

int form(int n)
{
    if (n < 0)
    {
        return (0);
    }
    return ((3 * n) * (n - 1) + 1);
}

int main(void)
{
    int N, ans;
    scanf("%d", &N);

   if (N == 1)
    {
        printf("1\n");
        return 0;
    }
    else if (N <= 0)
        return 0;
    for (int i = 1; i <= N; i++)
    {
        if (N > form(i - 1) && N <= form(i))
        {
            ans = i;
            break;
        }
    }
    printf("%d\n", ans);
}