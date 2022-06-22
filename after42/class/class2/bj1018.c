#include <stdio.h>
#define small(x, y) x < y ? x : y

int main(void)
{
    int M, N, count1, count2, min = 2500;
    char arr[50][50];
    scanf("%d %d", &M, &N);
    
    for (int i = 0; i < M; i++)
    {
        scanf("%s", arr[i]);
    }

    for (int i = 0; i < M - 7; i++)
    {
        for (int j = 0; j < N - 7; j++)
        {
            count1 = 0, count2 = 0;
            for (int k = i; k < i + 8; k++)
            {
                for (int h = j; h < j + 8; h++)
                {
                    if ((h + k) % 2 == 0)
                    {
                        if (arr[k][h] == 'W')
                            count1++;
                        else
                            count2++;
                    }
                    else
                    {
                        if (arr[k][h] == 'B')
                            count1++;
                        else
                            count2++;
                    }
                }
            }
            min = small(min, count1);
            min = small(min, count2);
        }
    }
    printf("%d\n", min);
}