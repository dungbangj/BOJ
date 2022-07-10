#include<stdio.h>
#define SZ 1000001
#define MIN(a,b) ( a < b ? a : b);
 
int N;
int N_arr[SZ];
 
 
void solution() {
    N_arr[0] = N_arr[1] = 0;
    int temp;
    for (int i = 2; i <= N; i++) 
	{
        N_arr[i] = N_arr[i - 1] + 1;
        if (i % 3 == 0) 
		{
            temp = N_arr[i / 3] + 1;
            N_arr[i] = MIN(N_arr[i], temp);
        }
        if (i % 2 == 0) 
		{
            temp = N_arr[i / 2] + 1;
            N_arr[i] = MIN(N_arr[i], temp);
        }
    }
    printf("%d", N_arr[N]);
}
 
int main() 
{
    scanf("%d", &N);
    solution();
}