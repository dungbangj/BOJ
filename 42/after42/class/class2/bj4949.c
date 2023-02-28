#include <stdio.h>

int main(void)
{
    while (1)
    {
        int arr[150], j = 0;
        char string[150];
        fgets(string, 150, stdin);

        if (string[0] == '.')
            break;

        for (int i = 0; i < 150; i++)
            arr[i] = 0;
        
        for (int i = 0; i < 150; i++)
        {
            if (string[i] == '[')
                arr[j++] = '[';
            else if (string[i] == '(')
                arr[j++] = '(';
            else if (string[i] == ']')
            {
                if (arr[j - 1] == '[')
                    arr[--j] = 0;
                else
                {
                    printf("no\n");
                    break;
                }
            }
            else if (string[i] == ')')
            {
                if (arr[j - 1] == '(')
                    arr[--j] = 0;
                else
                {
                    printf("no\n");
                    break;
                }
            }
            else if (string[i] == '.')
            {
                if (arr[0] == 0)
                    printf("yes\n");
                else
                    printf("no\n");
                break;
            }
        }
    }
}