#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  int n1=n;
  int r=n1%10;
  while(n>10)
  {
    n=n/10;
  }
  int s=n+r;
  printf("%d",s);
	return 0;
}