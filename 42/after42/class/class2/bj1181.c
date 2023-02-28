#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct
{
    char string[51];
    int length;
} str;

str tmp[20001];

void Merge(str *arr, int first, int mid, int last)
{
    int i = first;
    int j = mid + 1;
    int k = first;

    while (i <= mid && j <= last)
    {
        if (arr[i].length < arr[j].length)
            tmp[k++] = arr[i++];
        else if (arr[i].length > arr[j].length)
            tmp[k++] = arr[j++];
        else 
        {
            if (strcmp(arr[i].string, arr[j].string) < 0)
                tmp[k++] = arr[i++];
            else
                tmp[k++] = arr[j++];
        }
    }

    while (i <= mid)
        tmp[k++] = arr[i++];
    while (j <= last)
        tmp[k++] = arr[j++];

    for (k = first; k <= last; k++)
        arr[k] = tmp[k];
}

void MergeSort(str *arr, int first, int last)
{
    int mid;
    if (first < last)
    {
        mid = (first + last) / 2;
        MergeSort(arr, first, mid);
        MergeSort(arr, mid + 1, last);
        Merge(arr, first, mid, last);
    }
}

int main(void)
{
    int N;
    scanf("%d", &N);
    str arr[N];

    for (int i = 0; i < N; i++)
    {
        scanf("%s", arr[i].string);
        arr[i].length = strlen(arr[i].string);
    }

    MergeSort(arr, 0, N - 1);

    // printf("----------------\n");
    printf("%s\n", arr[0].string);
    for (int i = 1; i < N; i++)
    {
        if (strcmp(arr[i - 1].string, arr[i].string) != 0)
            printf("%s\n", arr[i].string);
    }
}


