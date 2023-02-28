#include <stdio.h>

int main(void)
{
    int N, i = 0, count = 0, j;
    scanf("%d", &N);

    int arr[N];

    while (i < N)
    {
        scanf("%d", &arr[i]);
        if (arr[i] == 1)
        {
            i++;
            continue;
        }
        for (j = 2; j < arr[i]; j++)
        {
            if (arr[i] % j == 0 && j != arr[i])
                break;
        }
        if (j == arr[i])
        {
            count++;
        }

        i++;
    }
    printf("%d\n", count);
}