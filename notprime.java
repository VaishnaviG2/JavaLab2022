import java.util.Scanner;
class notprime
{
public static void main(String[]args)
{
int num=3;
boolean flag = false;
for(int i=2;i<=num/2;++i)
{
if(num % i==0)
{
flag=true;
}
}
if(!flag)
System.out.print(num + "is a prime number.");
else
System.out.print(num + "is not a prime number.");
}
}