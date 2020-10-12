#include <stdio.h>
int lucky(int i)
{
  int r;
  while(i>0)
  {
    r=i%10;
    if(!(r==1 || r==4 || r==9))
      return 0;
    i=i/10;
  }
  return 1;
}
int countnumber(int m,int n)
{
  int i,count;
  count=0;
  if(m>n)
  {
    return -1;
  }
  else
  {
    for(i=m;i<=n;i++)
    {
      count=count+lucky(i);
    }
  }
  return count;
}

int main()
{
  int m,n,ans;
  scanf("%d",&m);
  scanf("%d",&n);
  ans=countnumber(m,n);
  printf("%d",ans);
  return 0;
}