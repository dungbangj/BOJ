#include <stdio.h>
#include <string.h>

int main(void)
{
    int N;
    scanf("%d", &N);
    for (int i = 0; i < N; i++)
    {
        int S;
        char arr[20];
        scanf("%d", &S);
        scanf("%s", arr);
        int len = strlen(arr);

        for (int j = 0; j < len; j++)
        {
            for (int k = 0; k < S; k++)
            {
                printf("%c", arr[j]);
            }
        }
        printf("\n");
    }
}

