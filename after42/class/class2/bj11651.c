#include <stdio.h>
#include <stdlib.h>

typedef struct numXY_s
{
    int x;
    int y;
} numXY;


int compare(const void *a, const void *b)
{
    numXY *one = (numXY *)a;
    numXY *two = (numXY *)b;

    if (one->y < two->y)
        return (-1);
    else if (one->y > two->y)
        return (1);
    else if (one->y == two->y)
    {
        if (one->x < two->x)
            return (-1);
        else
            return (1);
    }
    return (0);
}

int main(void)
{
    int N;
    scanf("%d", &N);
    numXY *numList;

    numList = (numXY *)malloc(sizeof(numXY) * N);

    for (int i = 0; i < N; i++)
    {
        scanf("%d %d", &numList[i].x, &numList[i].y);
    }

    qsort(numList, N, sizeof(numList[0]), compare);
    
    for (int i = 0; i < N; i++)
    {
        printf("%d %d\n", numList[i].x, numList[i].y);
    }
}