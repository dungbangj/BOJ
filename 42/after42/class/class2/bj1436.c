#include <stdio.h>

int my_pow(int a, int b)
{
    int res = 1;
    if (b == 0)
        return (1);
    while(b)
    {
        res *= a;
        b--;
    }
    return (res);
}

int main()
{
    int res = 665;
    int num;
    scanf("%d", &num);
    int a = 0;

    while (1)
    {
        if (a == num)
        {
            printf("%d", res);
            break;
        }

        res++;
        
        for (int i = 0; i <= 10; i++)
        {
            if (res / my_pow(10, i) % 1000 == 666)
            {
                a++; 
                break;
            }
        }
    }
}
