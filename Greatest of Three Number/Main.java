#include <stdio.h>

int main()
{ 
    // type your code here
  int a,b,c;
  scanf("%d,%d,%d",&a,&b,&c);
  if(a>b && a>c)
  {
    printf("%d",a);
  }
  if(b>c && b>a)
  {
    printf("%d",b);
  }
  if(c>b && c>a)
  {
    printf("%d",c);
  }
}