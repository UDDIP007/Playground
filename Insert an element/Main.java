#include <stdio.h>
#include<stdlib.h>
int main()
{
   // Try out your code here
  int n,s,e,i;
  scanf("%d",&n);
  int* arr=(int*) malloc(n*sizeof(int));
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d%d",&s,&e);
  n=n+1;
  arr=realloc(arr,sizeof(arr)+sizeof(int));
  for(i=n-1;i>=s;i--)
  {
    arr[i] = arr[i-1];
  }
  arr[s-1]=e;
  for(i=0;i<n;i++)
  {
    printf("%d ",arr[i]);
  }
  return 0;
}