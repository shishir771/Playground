#include <stdio.h>
int main() {
	//Type your code
  int n,fac=1;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
    fac=fac*i;
  }
  printf("%d",fac);
	return 0;
}