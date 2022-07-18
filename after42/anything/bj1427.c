#include <stdio.h>
#include <stdlib.h>

int compare(const void *a, const void *b)
{
    return (*(int *)b - *(int *)a);
}

int ft_numlen(long long num)
{
    int i = 0;

    while (num > 0)
    {
        num /= 10;
        i++;
    }
    return (i);
}

int main(void)
{
    long long num;

    scanf("%lld", &num);
    int size = ft_numlen(num);

    int arr[size];
    for (int i = 0; i < size; i++)
    {
        arr[i] = num % 10;
        num /= 10;
    }
    qsort(arr, size, sizeof(int), compare);
    for (int i = 0; i < size; i++)
        printf("%d", arr[i]);
    printf("\n");
}