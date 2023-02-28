#include <stdio.h>
 
int arr[1000001];
 
int main() {
	int m, n;
	int i, j;
	scanf("%d %d", &m, &n);
 
	for (i = 2; i <= n; i++) 
    {
		if (!arr[i]) 
        {
			for (j = i + i; j <= n; j += i)
				arr[j] = 1;
		}
		if (i >= m && arr[i] == 0) 
            printf("%d\n", i);
	}
	
	return 0;
}