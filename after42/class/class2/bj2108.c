#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int compare(const void *a, const void *b)
{
    int num1 = *(int *)a;
    int num2 = *(int *)b;

    if (num1 > num2)
        return (1);
    else if (num1 < num2)
        return (-1);
    else
        return (0); 
}

int main(void)
{
    int N, i = 0, max = 0, idx, count = 0, j;
    double sum = 0;
    scanf("%d", &N);
    int arr[N];
    int num[8001] = {0};

    while (i < N)
    {
        scanf("%d", &arr[i]);
        sum += arr[i];
        i++;
    }
    // printf("\n");

    printf("%d\n", (int)round(sum / N));
    
    qsort(arr, N, sizeof(int), compare);

    printf("%d\n", arr[N/ 2]);

    for (j = 0; j < N; j++)
    {
        idx = arr[j] + 4000;
        num[idx]++;

        if (max < num[idx])
            max = num[idx];
    }

    for (j = 0, idx = 0; j < 8001; j++)
    {
        if (num[j] == 0)
            continue;
        
        if (num[j] == max)
        {
            if (count == 0)
            {
                idx = j;
                count++;
            }
            else if (count == 1)
            {
                idx = j;
                break;
            }
        }
    }
    printf("%d\n", idx - 4000);
    printf("%d\n", arr[N - 1] - arr[0]);
}