#include <stdio.h>
#include <string.h>

int main(void)
{
    char arr[100];
    char al[26];

    for (int i = 0; i < 26; i++)
        al[i] = -1;
    scanf("%s", arr);
    int len = strlen(arr);

    for (int i = 0; i < len; i++)
    {
        if (al[arr[i] - 'a'] == -1)
            al[arr[i] - 'a'] = i;
    }

    for (int i = 0; i < 26; i++)
    {
        printf("%d", al[i]);
        if (i != 25)
            printf(" ");
    }
    printf("\n");
}