#include <stdio.h>
int main()
{
   // Try out your code here
 	int a[3],ap,m,r,i,s;
  	for(i=0;i<3;i++)
    {
      scanf("%d",&a[i]);
    }
  	ap=a[0];
  	m=a[1];
  	r=a[2];
  	if(a>m)
    {
      i=ap-m;
      s=i*1;
      r=r-s;
      printf("%d",r);
    }
  	else{
      printf("%d",r);
    }
      
}