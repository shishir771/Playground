#include <stdio.h>
int main() {
	int n,fac=1,r,s=0;
  scanf("%d",&n);
  int n1=n;
  while(n>0)
  {
    r=n%10;
    fac=1;
    for(int i=1;i<=r;i++)
    {
      
      fac=fac*i;
    }
    s=s+fac;
    n=n/10;
  }
  if(s==n1)
  {
    printf("Yes");
  }
  else
  {
    printf("No");
  }
	return 0;
}