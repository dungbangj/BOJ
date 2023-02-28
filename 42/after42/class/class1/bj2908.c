#include <stdio.h>

int numSwap(int num)
{
    int hundred1, one1;
    hundred1 = num / 100;
    one1 = num % 10;
    num -= (hundred1 * 100 + one1);
    num += (one1 * 100 + hundred1);

    return (num);
}

int main(void)
{
    int f, s;
    scanf("%d", &f);
    scanf("%d", &s);
    
    f = numSwap(f);
    s = numSwap(s);

    printf("%d\n", f > s ? f : s);
}