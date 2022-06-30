#include <stdio.h>
#include <stdlib.h>

int compare(const void *a, const void *b)
{
    return (*(int *)a - *(int *)b);
}

int main(void)
{
    int N, M;
    scanf("%d %d", &N, &M);
    int arr[N];
    for (int i = 0; i < N; i++)
    {
        scanf("%d", &arr[i]);
    }
    qsort(arr, N, sizeof(int), compare);

    int first, last, sum, closest, diff = 300001;
    for (int i = 0; i < N - 2; i++)
    {
        first = i + 1;
        last = N - 1;
        while (first < last)
        {
            sum = arr[first] + arr[i] + arr[last];
            if (abs(sum - M) < diff && sum < M)
            {
                diff = abs(sum - M);
                closest = sum;
            }
            if (sum == M)
            {
                printf("%d\n", sum);
                return (0);
            }
            else if (sum < M)
                first++;
            else
                last--;
            
        }
    }
    printf("%d\n", closest);
}