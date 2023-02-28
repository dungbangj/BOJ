#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
    int N;
    scanf("%d", &N);

    for (int i = 0; i < N; i++)
    {
        unsigned char arr[51];
        int j = 0, sum = 0, flag = 0;
        scanf("%s", arr);

        while (arr[j])
        {
            if (arr[0] == ')' || (arr[j] != '(' && arr[j] != ')'))
            {
                flag = 0;
                break;
            }
            if (arr[j] == '(')
            {
                sum += 1;
                flag = 1;
            }
            else if (arr[j] == ')')
                sum -= 1;
            if (sum < 0)
            {
                flag = 0;
                break;
            }
            j++;
        }
        if (sum == 0 && j != 0 && flag)
            printf("YES\n");
        else
            printf("NO\n");
    }
}