#include <stdio.h>
#include<math.h>
int main()
{
  	//Your code here  
  int b,e;
  scanf("%d%d",&b,&e);
  if(e<0)
  {
    printf("Wrong input");
  }
  else
  {
    int a=pow(b,e);
    printf("%d",a);
  }
    return 0;
}