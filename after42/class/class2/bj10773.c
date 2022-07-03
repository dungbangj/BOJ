#include <stdio.h>

int main(void)
{
    int N, tmp = 0, sum = 0;
    scanf("%d", &N);
    int arr[N];

    for (int i = 0; i < N; i++)
    {
        scanf("%d", &arr[i]);
        if (arr[i] == 0)
        {
            tmp = i;
            while (arr[i] == 0)
            {
                i--;
            }
            arr[i] = 0;
            i = tmp;
        }
    }

    for (int i = 0; i < N; i++)
    {
        sum += arr[i];
    }
    printf("%d\n", sum);
}
