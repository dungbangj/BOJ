#include <stdio.h>

int main(void)
{
    int arr1[3], arr2[3], ans1, ans2;

    for (int i = 0; i < 3; i++)
        scanf("%d %d", &arr1[i], &arr2[i]);
    if (arr1[0] == arr1[1])
        ans1 = arr1[2];
    else if (arr1[0] == arr1[2])
        ans1 = arr1[1];
    else
        ans1 = arr1[0];

    if (arr2[0] == arr2[1])
        ans2 = arr2[2];
    else if (arr2[0] == arr2[2])
        ans2 = arr2[1];
    else
        ans2 = arr2[0];

    printf("%d %d\n", ans1, ans2);
}