#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(void)
{
    int N;
    scanf("%d", &N);
    int arr[N], j = 0, num, count, h = 0;
    for (int i = 0; i < N; i++)
    {
        arr[i] = 0;
    }

    char command[10];
    for (int i = 0; i < N; i++)
    {
        count = 0;
        scanf("%s", command);
        if (!strcmp(command, "push"))
        {
            scanf("%d", &num);
            arr[j++] = num;
        }
        else if (!strcmp(command, "pop"))
        {
            if (arr[h] == 0)
                printf("-1\n");
            else
            {
                printf("%d\n", arr[h]);
                arr[h++] = 0;
            }
        }
        else if (!strcmp(command, "size"))
        {
            printf("%d\n", abs(h - j));
        }
        else if (!strcmp(command, "empty"))
        {
            for (int k = 0; k < N; k++)
                if (arr[k])
                    count++;
            if (count)
                printf("0\n");
            else
                printf("1\n");
        }
        else if (!strcmp(command, "front"))
        {
            if (!arr[h])
                printf("-1\n");
            else
                printf("%d\n", arr[h]);
        }
        else if (!strcmp(command, "back"))
        {
            if (j == 0 && !arr[j])
                printf("-1\n");
            else if (!arr[j - 1])
                printf("-1\n");
            else
                printf("%d\n", arr[j - 1]);
        }
    }
}