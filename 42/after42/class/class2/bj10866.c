#include <stdio.h>
#include <string.h>

int main(void)
{
    int N, num;
    scanf("%d", &N);
    int arr[2 * N + 1];
    for (int i = 0; i <= 2 * N; i++)
        arr[i] = 0;
    int f = 0, b = 2 * N, count;

    for (int i = 0; i < N; i++)
    {
        count = 0;
        char command[20];
        scanf("%s", command);

        if (!strcmp(command, "push_front"))
        {
            scanf("%d", &num);
            while (!arr[f] && f < 2 * N)
                f++;
            if (f == 2 * N)
                arr[N] = num;
            else
                arr[f - 1] = num;
            f = 0;
        }
        else if (!strcmp(command, "push_back"))
        {
            scanf("%d", &num);
            while (!arr[b] && b > 0)
                b--;
            if (b == 0)
                arr[N] = num;
            else
                arr[b + 1] = num;
            b = 2 * N;
        }
        else if (!strcmp(command, "pop_front"))
        {
           while (!arr[f] && f < 2 * N)
                f++;
            if (f == 2 * N && !arr[f - 1])
                printf("-1\n");
            else
            {
                printf("%d\n", arr[f]);
                arr[f] = 0;
            }
            f = 0;
        }
        else if (!strcmp(command, "pop_back"))
        {
            while (!arr[b] && b > 0)
                b--;
            if (b == 0 && !arr[b + 1])
                printf("-1\n");
            else
            {
                printf("%d\n", arr[b]);
                arr[b] = 0;
            }
            b = 2 * N;
        }
        else if (!strcmp(command, "size"))
        {
            for (int j = 0; j <= 2 * N; j++)
                if (arr[j])
                    count++;
            printf("%d\n", count);
        }
        else if (!strcmp(command, "empty"))
        {
            for (int j = 0; j <= 2 * N; j++)
                if (arr[j])
                    count++;
            if (count)
                printf("0\n");
            else
                printf("1\n");
        }
        else if (!strcmp(command, "front"))
        {
            for (int j = 0; j <= 2 * N; j++)
                if (arr[j])
                {
                    count++;
                    printf("%d\n", arr[j]);
                    break;
                }
            if (!count)
                printf("-1\n");
        }
        else if (!strcmp(command, "back"))
        {
            for (int j = 2 * N; j >= 0; j--)
                if (arr[j])
                {
                    count++;
                    printf("%d\n", arr[j]);
                    break;
                }
            if (!count)
                printf("-1\n");
        }
    }
}