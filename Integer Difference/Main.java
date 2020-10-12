#include <stdio.h>
int main()
{
   // Try out your code here
  int a[100],n,c,d,b[2],i,j;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=0;i<2;i++)
  {
    scanf("%d",&b[i]);
  }
  c=b[0];
  d=b[1];
  for(i=0;i<n;i++)
  {
    int diff=a[i]-c;
    if(diff<d)
    {
      a[i]=a[i]+1;
    }
  }
  for(i=0;i<n;i++)
  {
    printf("%d ",a[i]);
  }
   return 0;
}