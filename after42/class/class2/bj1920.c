#include <stdio.h>
#include <stdlib.h>

int compare(const void *a, const void *b)
{
    
}

void BinarySearch(int *A, int num, int N)
{
    int mid, left = 0, right = N - 1;
    while (1)
    {
        mid = (left + right) / 2;
        if (A[mid] == num || A[left] == num || A[right] == num)
        {
            printf("1\n");
            break;
        }
        
        if (A[mid] < num)
            left = mid + 1;
        else if (A[mid] > num)
            right = mid - 1;

        if (left >= right)
        {
            printf("0\n");
            break;
        }
    }
}

int main(void)
{
    int N, M;
    scanf("%d", &N);

    int A[N];
    for (int i = 0; i < N; i++)
        scanf("%d", &A[i]);
    qsort(A, N, sizeof(int), compare);

    scanf("%d", &M);
    int B[M];
    for (int i = 0; i < M; i++)
        scanf("%d", &B[i]);

    for (int i = 0; i < M; i++)
    {
        BinarySearch(A, B[i], N);
    }
}