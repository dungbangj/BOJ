#include <stdio.h>
int main() {
	int cnt, n, m;
	int i, j, k;
	int arr[100] = { 0, };
 
	scanf("%d", &cnt);
 
	for (i = 0; i < cnt; i++)
	{
		scanf("%d %d", &n, &m);
		int ans = 1;
		int front = 0;
		int max = 0;
		for (j = 0; j < n; j++)
			scanf("%d", &arr[j]);
 
		while (1) 
		{
			for (k = 0; k < n; k++)
				if (arr[k] > max)
                    max = arr[k];
 
			while (arr[front] != max)
				front = (front + 1) % n;
 
			if (front == m) //현재 위치한 index값(front)이 우리가 원하는 m값과 같다면 break
                break;
 
			arr[front] = 0; //프린트가 이미 된 요소는 0으로 만들어 없는 것 취급
			front = (front + 1) % n; //원래 프론트는 max값이 인덱스 값일 테니 +1을 해줘서 초기화 다른 값을 가리키게 한다.
			max = 0; //max값은 프린트 됐으니 0으로 초기화
			ans++;
		}
		printf("%d\n", ans);
	}
	return 0;
}