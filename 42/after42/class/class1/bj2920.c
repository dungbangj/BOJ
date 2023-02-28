#include <stdio.h>

int main(void)
{
    int f[8];

    for (int i = 0; i < 8; i++)
    {
        scanf("%d", &f[i]);
    }

    if (f[0] == 1)
    {
        for (int i = 0; i < 8; i++)
        {
            if (f[i] != i + 1)
            {
                printf("mixed\n");
                return 0;
            }
        }
        printf("ascending\n");
    }
    else if (f[0] == 8)
    {
        for (int i = 0; i < 8; i++)
        {
            if (f[i] != 8 - i)
            {
                printf("mixed\n");
                return 0;
            }
        }
        printf("descending\n");
    }
    else
        printf("mixed\n");

    return 0;
}