#include <stdio.h>
int main()
{
   // Try out your code here
  int m,n,sum,i;
  sum=0;
  scanf("%d",&m);
  scanf("%d",&n);
  for(i=m;i<=n;i++)
  {
    if(i%3==0 && i%5==0)
    {
      sum=sum+i;
    }
  }
  printf("%d",sum);
   return 0;
}