#include <stdio.h>
#include <string.h>
int main(void)
{
    int N;
    scanf("%d", &N);
    int arr[10001], j = 0, num, k;

    char command[10];
    for (int i = 0; i < N; i++)
    {
        scanf("%s", command);
        if (!strcmp(command, "push"))
        {
            scanf("%d", &num);
            arr[j++] = num;
        }
        else if (!strcmp(command, "pop"))
        {
            j--;
            if (arr[0] == 0)
            {
                j = 0;
                printf("-1\n");
            }
            else
            {
                printf("%d\n", arr[j]);
                arr[j] = 0;
            }
        }
        else if (!strcmp(command, "size"))
        {
            for (k = 0; k < N; k++)
                if (arr[k] == 0)
                    break;
            printf("%d\n", k);
        }
        else if (!strcmp(command, "empty"))
        {
            if (arr[0] == 0)
            {
                j = 0;
                printf("1\n");
            }
            else
                printf("0\n");
        }
        else if (!strcmp(command, "top"))
        {
            if (arr[0] == 0)
            {
                j = 0;
                printf("-1\n");
            }
            else
                printf("%d\n", arr[j - 1]);
        }
    }
}