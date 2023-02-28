#include <stdio.h>

int main(void)
{
    int A, B, tmpA;
    scanf("%d %d", &A, &B);

    if (A <= B)
    {
        int tmp;
        tmp = A;
        A = B;
        B = tmp;
    }

    tmpA = A;

    while (tmpA > 0)
    {
        if (A % tmpA == 0)
            if (B % tmpA == 0)
            {
                printf("%d\n", tmpA);
                break;
            }
        tmpA--;
    }

    printf("%d\n", tmpA * (A / tmpA) * (B / tmpA));
}