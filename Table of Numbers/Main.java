#include <stdio.h>
int main()
{
   // Try out your code here
  int n,i,mul,sum;
  sum=0;
  scanf("%d",&n);
  for(i=1;i<=10;i++)
  {
    mul=n*i;
    printf("%d ",mul);
    sum=sum+mul;
  }
   printf("\n%d",sum);
   return 0;
}