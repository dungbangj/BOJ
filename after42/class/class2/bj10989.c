#include <stdio.h>

int main(void)
{
    int N, num;
    scanf("%d", &N);
    int arr[10001] = {0};

    for (int i = 0; i < N; i++)
    {
        scanf("%d", &num);
        arr[num]++;
    }

    for (int i = 1; i < 10001; i++)
        for (int j = 1; j <= arr[i]; j++)
            printf("%d\n", i);

    return (0);
}