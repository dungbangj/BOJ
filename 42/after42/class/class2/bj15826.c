#include <stdio.h>

#define M 1234567891

int main(void)
{
    long long L, sum = 0, R = 1;
    scanf("%lld", &L);

    char    arr[L];
    scanf("%s", arr);

    for (long long i = 0; i < L; i++)
    {
        sum = (sum + ((arr[i] - 96) * R)) % M;
        R = R * 31 % M;
    }

    printf("%lld\n", sum); 
}
