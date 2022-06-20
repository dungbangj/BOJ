#include <stdio.h>
#include <string.h>

int main(void)
{
    int count = 0, i, len;
    char arr[1000000];

    count = 0;
    //scanset
    //이 스캔셋을 쓰지 않고 %s만 쓴다면 공백을 만났을 때 입력이 끊긴다.
    //스캔셋 안에 있는 ^\n은 줄바꿈 문자를 제외한다는 의미이다.
    scanf("%[^\n]s", arr);
    len = strlen(arr);

    for (i = 0; i < len; i++)
    {
        if (arr[i] == ' ')
        {
            if (i != 0 && i != len - 1)
                count++;
            if (len == 1)
                count = -1;
        }
    }
    printf("%d\n", count + 1);
    return 0;
}