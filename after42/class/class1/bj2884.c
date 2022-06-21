#include <stdio.h>

int main(void)
{
    int h, m;
    scanf("%d", &h);
    scanf("%d", &m);

    if ((0 <= h && h <= 23) && (0 <= m && m <= 59))
    {
        if (m < 45)
        {
            if (h == 0)
                h = 23;
            else
                h -= 1;
            m = 60 - (45 - m);
        }
        else
            m -= 45;
    }
    else
        return 0;
    printf("%d %d\n", h, m);
    return 0;
}