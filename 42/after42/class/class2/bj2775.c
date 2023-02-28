#include <stdio.h>

int main(void)
{
    int N, k, n, sum, i = 0;
    scanf("%d", &N);
    while (1)
    {
        Loop:
        if (i == N)
            break;
        scanf("%d", &k);
        scanf("%d", &n);
        int arr[100][14];
        for (int j = 0; j < 14; j++)
            arr[0][j] = j + 1;
        for (int j = 1; j <= k; j++)
        {
            sum = 0;
            for (int h = 0; h < 14; h++)
            {
                sum += arr[j - 1][h];
                arr[j][h] = sum;
                if (j == k && h == n - 1)
                {
                    printf("%d\n", sum);
                    i++;
                    goto Loop;
                }
            }
        }
        i++;
    }
}