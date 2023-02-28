#include <stdio.h>

int main(void)
{
    int A, B, V;
    int day;

    scanf("%d %d %d", &A, &B, &V);

    day = (V - B - 1) / (A - B) + 1;

    printf("%d\n", day);
}