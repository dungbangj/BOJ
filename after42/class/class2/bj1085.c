#include <stdio.h>

int main(void)
{
    int x, y, w, h, min = 1001;

    scanf("%d %d %d %d", &x, &y, &w, &h);

    int ans[4] = {x, y, w - x, h - y};
    for (int i = 0; i < 4; i++)
    {
        if (ans[i] < min)
            min = ans[i];
    }
    printf("%d\n", min);
}