#include <stdio.h>
#include <stdlib.h>

typedef struct info
{
    int times;
    int heights;
    int blocks;
} inf;

int compare(const void *one, const void *two)
{
    inf *a = (inf *)one;
    inf *b = (inf *)two;

    if (a->times > b->times)
        return (-1);
    else if (a->times < b->times)
        return (1);
    else
    {
        if (a->heights > b->heights)
            return (1);
        else
            return (-1);
    }
    return (0);
}

int main(void)
{
    int N, M, B, tmpB, time, k = 0;
    scanf("%d %d %d", &N, &M, &B);

    int arr[N * M], max = 0, min = 257;
    for (int i = 0; i < N * M; i++)
    {
        scanf("%d", &arr[i]);
        if (max < arr[i])
            max = arr[i];
        if (min > arr[i])
            min = arr[i];
    }
    inf list[max - min + 1];

    for (int i = min; i <= max; i++)
    {
        time = 0;
        tmpB = B;
        for (int j = 0; j < N * M; j++)
        {
            if (arr[j] > i)
            {
                time += 2 * (arr[j] - i);
                tmpB += arr[j] - i;
            }
            else if (arr[j] < i)
            {
                time += (i - arr[j]);
                tmpB -= i - arr[j];
            }
        }
        if (tmpB >= 0)
        {
            list[k].times = time;
            list[k].heights = i;
            list[k].blocks = tmpB;
            k++;
        }
    }
    qsort(list, k, sizeof(list[0]), compare);

    printf("%d %d\n", list[k - 1].times, list[k - 1].heights);
}