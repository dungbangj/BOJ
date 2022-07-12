
#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int comp(const void*a, const void*b)
{
    return (strcmp((char*)a, (char*)b));
}

typedef struct inf
{
    char name[21];
	char who[21];
} info;

info name[1000001];
info who[500001];

int main()
{
    int n, m, i, c = 0;

    scanf("%d %d", &n, &m);
    for(i=0;i<n+m;i++)
        scanf("%s", name[i].name);
    qsort(name, n+m, sizeof(name[0]), comp);
    for(i=0;i<n+m;i++)
        if(strcmp(name[i].name, name[i+1].name) == 0)
            strcpy(who[c++].who,name[i++].name);
    printf("%d\n", c);
    for(i=0;i<c;i++)
        printf("%s\n", who[i].who);
}
