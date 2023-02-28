#include <stdio.h>

int main(void)
{
    int N;
    scanf("%d", &N);

    int score[N];
    int max = 0;
    for (int i = 0; i < N; i++)
    {
        scanf("%d", &score[i]);
        if (max < score[i])
            max = score[i];
    }

    float sum = 0;

    for (int i = 0; i < N; i++)
    {
        sum += ((float)score[i] / max) * 100;
    }

    printf("%f\n", sum / N);
    return 0;
}