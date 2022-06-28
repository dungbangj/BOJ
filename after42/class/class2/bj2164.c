#include <stdio.h>
#include <math.h>

int main(void)
{
    int arr[1000000] = {0};
    int N, i = 0, j = 0, tmp, tmpN;
    scanf("%d", &N);

    for (; i < N; i++)
        arr[i] = i + 1;

    tmpN = N;
    while (tmpN > 1)
    {
        arr[j++] = 0;
        tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
        i++;
        j++;
        tmpN--;
    }

    for (int h = 0; h < 1000000; h++)
    {
        if (arr[h] != 0)
        {
            printf("%d\n", arr[h]);
            break;
        }
    }
}