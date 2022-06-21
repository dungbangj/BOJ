#include <stdio.h>

int main(void)
{
    int input;
    int al[10];
    int mul = 1;

    for (int i = 0; i < 10; i++)
        al[i] = 0;

    for (int i = 0; i < 3; i++)
    {
        scanf("%d", &input);
        mul *= input;
    }
    while (mul > 0)
    {
        al[mul % 10]++;
        mul /= 10;
    }

    for (int i = 0; i < 10; i++)
    {
        printf("%d\n", al[i]);
    }
}