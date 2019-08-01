#include<stdio.h>
int main()
{
	//your code here
  long int a;
  scanf("%ld",&a);
  long int fact=1;
  for(int i=1;i<=a;i++)
  {
    fact=fact*i;
  }
  printf("%ld",fact);
  
}