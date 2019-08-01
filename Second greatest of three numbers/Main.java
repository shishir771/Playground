#include<stdio.h>
int main()
{
  // Type your code here
  int a,b,c,d;
  scanf("%d%d%d",&a,&b,&c);
  if(a>b && a>c)
  {
    d=a;
  }
  else if(b>c && b>a)
  {
    d=b;
  }
  else if(c>a && c>b)
  {
    d=c;
  }
  
  if(a==d)
  {
    a=a-d;
  }
  else if(b==d)
  {
    b=b-d;
  }
  else if(c==d)
  {
    c=c-d;
  }
  if(a>b && a>c)
  {
    printf("%d",a);
  }
  else if(b>c && b>a)
  {
    printf("%d",b);
  }
  else if(c>a && c>b)
  {
    printf("%d",c);
  }
  
}