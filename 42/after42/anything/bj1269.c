#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int compare(const void *a, const void *b)
{
    return (*(int *)a - *(int *)b);
}

int binary_search(int *arr, int num, int len)
{
    int f = 0, l = len - 1, mid;
    while (f <= l)
    {
        mid = (f + l) / 2;
        if (arr[mid] == num)
            return (1);
        else if (arr[mid] < num)
            f = mid + 1;
        else
            l = mid - 1;
    }
    return (0);
}

int main(void)
{
    int N, M, A[200000], B[200000], count = 0, whatA, whatB;
    scanf("%d %d", &N, &M);

    for (int i = 0; i < N; i++)
        scanf("%d", &A[i]);
    for (int i = 0; i < M; i++)
        scanf("%d", &B[i]);
    qsort(A, N, sizeof(int), compare);
    qsort(B, M, sizeof(int), compare);
    for (int i = 0; i < N; i++)
        count += binary_search(B, A[i], M);
    whatA = N - count;
    count = 0;
    for (int i = 0; i < M; i++)
        count += binary_search(A, B[i], N);
    whatB = M - count;
    printf("%d\n", whatA + whatB);
}