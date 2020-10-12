#include <stdio.h>
int main()
{
   // Try out your code here
  int n,a[100],s,i,flag;
  flag=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d",&s);
  for(i=0;i<n;i++)
  {
    if(a[i]==s)
    {
      printf("index = %d",i);
      flag++;
    }
  }
  if(flag==0)
  {
    printf("-1");
  }
   return 0;
}