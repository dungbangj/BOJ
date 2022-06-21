#include <stdio.h>
#include <string.h>

int main(void)
{
    int N, len;
    char arr[80];

    scanf("%d", &N);
    for (int i = 0; i < N; i++)
    {
        int flag = 0, sum = 0, num = 1;
        scanf("%s", arr);
        len = strlen(arr);
        for (int i = 0; i < len; i++)
        {
            if (flag == 0)
            {
                if (arr[i] == 'O')
                {
                    sum += num++;
                    flag = 1;
                }
            }
            else
            {
                if (arr[i] == 'O')
                    sum += num++;
                else
                {
                    num = 1;
                    flag = 0;
                }
            }
        }
        printf("%d\n", sum);
    }
}