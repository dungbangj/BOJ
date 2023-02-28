#include <stdio.h>
#include <string.h>

int arr[51][51];

int dfs(int a, int b, int M, int N)
{
    arr[a][b] = 0;

    if (arr[a + 1][b] == 1 && a + 1 < M)
        dfs(a + 1, b, M, N);
    if (arr[a - 1][b] == 1 && a - 1 >= 0)
        dfs(a - 1, b, M, N);
    if (arr[a][b + 1] == 1 && b + 1 < N)
        dfs(a, b + 1, M, N);
    if (arr[a][b - 1] == 1 && b - 1 >= 0)
        dfs(a, b - 1, M, N);
    return (0);
}

int main(void)
{
    int T, x, y, cnt;
    scanf("%d", &T);
    int M, N, K;
    
    for (int i = 0; i < T; i++)
    {
        scanf("%d %d %d", &M, &N, &K);
        memset(arr, 0, sizeof(arr));
        cnt = 0;
        while (K--)
        {
            scanf("%d %d", &x, &y);
            arr[x][y] = 1;
        }
        for (int j = 0; j < M; j++)
        {
            for (int k = 0; k < N; k++)
            {
                if (arr[j][k] == 1)
                {
                    dfs(j, k, M, N);
                    cnt++;
                }
            }
        }
        printf("%d\n", cnt);
    }
}