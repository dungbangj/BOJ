#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    int N, M;
    scanf("%d", &N);
    int arr[N], *countP, *countM;
    countP = (int *)malloc(10000001 * sizeof(int));
    countM = (int *)malloc(10000001 * sizeof(int));

    for (int i = 0; i < N; i++)
    {
        scanf("%d", &arr[i]);
        if (arr[i] > 0)
            countP[arr[i]]++;
        else
            countM[-arr[i]]++;
    }
    scanf("%d", &M);
    int num;
    for (int i = 0; i < M; i++)
    {
        scanf("%d", &num);
        if (i == 0)
        {
            if (num > 0)
                printf("%d", countP[num]);
            else
                printf("%d", countM[-num]);
            continue;
        }
        if (num > 0)
            printf(" %d", countP[num]);
        else
            printf(" %d", countM[-num]);
    }
    printf("\n");
    free(countM);
    free(countP);
}