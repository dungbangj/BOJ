#include <stdio.h>
#include <stdlib.h>

void fibonacci(int n)
{
    int now = 1;
    int back = 0;
    int front = 0;
    for (int i = 0; i <= n; i++)
    {
        back = now;
        now = front;
        front = now + back;
    }
    printf("%d %d\n", back, now);
}

int main(void)
{
    int T, num;
    scanf("%d", &T);


    for (int i = 0; i < T; i++)
    {
        scanf("%d", &num);
        fibonacci(num);
    }
}