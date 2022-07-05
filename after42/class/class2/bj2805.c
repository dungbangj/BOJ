#include <stdio.h>
#include <stdlib.h>

int tree_len_array[1000001];

int bin_search(int start, int end, int target, int tree_num)
{
    long long mid = 0;

    while (start <= end)
    {
        long long tree_length = 0;
        mid = (start + end) / 2;
        for (int i = 0; i < tree_num; i++)
        {
            if (mid < tree_len_array[i])
            {
                tree_length += tree_len_array[i] - mid;
            }
        }

        if (tree_length >= target)
            start = mid + 1;
        else
            end = mid - 1;
    }
    return (end);
}

int main(void)
{
    int N, M;
    scanf("%d %d", &N, &M);
    int max = 0;

    for (int i = 0; i < N; i++)
    {
        scanf("%d", &tree_len_array[i]);
        if (max < tree_len_array[i])
            max = tree_len_array[i];
    }

    int result = bin_search(1, max, M, N);
    printf("%d\n", result);
}