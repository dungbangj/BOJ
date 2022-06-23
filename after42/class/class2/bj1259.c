#include <stdio.h>
#include <string.h>

int main(void)
{
    char arr[99999];
    int len;

    Loop1:
    while (1)
    {
        scanf("%s", arr);
        if (strcmp(arr, "0") == 0)
            break;
        len = strlen(arr);
        for (int i = 0; i < len / 2; i++)
        {
            if (arr[i] != arr[len - 1 - i])
            {
                printf("no\n");
                goto Loop1;
            }
        }  
        printf("yes\n");
    }
}