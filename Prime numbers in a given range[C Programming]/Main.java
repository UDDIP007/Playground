#include<stdio.h>
int isprime(int n)
{
	//Your code goes here
  int i;
  int flag;
  flag=0;
  for(i=2;i<=n/2;i++)
  {
    if(n%i==0){
      flag++;
      break;
    }
  }
    if(flag==0)
      return 1;
    else
      return 0;  
}
void pol(int a, int b)
{
    int i;
    for(i=a;i<=b;i++)
    {
        if(isprime(i)==1)
            printf("%d ",i);
    }
}
int main()
{
    int a,b;
    scanf("%d %d",&a,&b);
    pol(a,b);
    return 0;
}
