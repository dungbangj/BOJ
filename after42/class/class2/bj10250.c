#include <stdio.h>

int main(void)
{
    int T, H, N, W, one, two;
    scanf("%d", &T);
    for (int i = 0; i < T; i++)
    {
        scanf("%d %d %d", &H, &N, &W);
        one = W % H;
        if (one == 0)
            one++;
        if (W % H == 0)
            one = H;
        two = W / H + 1;
        if (W % H == 0)
            two--;
        if (two > 9)
            printf("%d%d\n", one, two);
        else
        printf("%d0%d\n", one, two);
    }
}