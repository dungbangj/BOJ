#include <stdio.h>

int main(void)
{
    int mod[10];
    int num, tmp, count = 0, count0 = 0;

    for (int i = 0; i < 10; i++)
    {
        scanf("%d", &num);
        mod[i] = num % 42;
        if (mod[i] == 0 && count0 == 0)
            count0++;
    }

    for (int i = 0; i < 9; i++)
    {
        tmp = mod[i];
        for (int j = i + 1; j < 10; j++)
        {
            if (tmp == mod[j])
            {
                mod[j] = 0;
            }
        }
    }

    for (int i = 0; i < 10; i++)
    {
        if (mod[i] != 0)
            count++;
    }
    printf("%d\n", count + count0);
}