#include <stdio.h>
#include <string.h>

int main(void)
{
    char arr[1000000];
    int al[26];

    int max = 0, len;
    char ch;

    scanf("%s", arr);
    len = strlen(arr);

    for (int i = 0; i < len; i++)
    {
        if (arr[i] >= 'a')
            al[arr[i] - 'a']++;
        else
            al[arr[i] - 'A']++;
    }

    for (int i = 0; i < 26; i++)
    {
        if (al[i] > max)
        {
            max = al[i];
            ch = i + 'A';
        }
        else if (al[i] == max)
        {
            ch = '?';
        }
    }

    printf("%c\n", ch);
}