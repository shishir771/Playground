#include<stdio.h>
int main()
{
  //Type your code here
  int a;
  scanf("%d",&a);
  int r1=a%10;
  int r2=a/100;
  int r=r1+r2;
  printf("%d",r);
  return 0;
}