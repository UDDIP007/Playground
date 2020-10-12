#include<stdio.h>
int pattern(int n)
{
  int i,j; 
  //Your code goes here
  for(i=1;i<n;i++)
  {
    if(i==1 || i==n)
    {
      for(j=1;j<=n;j++)
      {
        printf("1");
      }
    }
    else
    {
     printf("1"); 
    for(j=1;j<=n-2;j++)
    {
      printf(" ");
    }
    printf("1");
  }
	printf("\n");
  }
  for(i=0;i<n;i++)
  {
  printf("1");
  }
}
     
void main()
{
    int n;
    scanf("%d",&n);
    pattern(n);
}
