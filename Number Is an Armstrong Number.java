boolean IsArmstrongNumber(int number)
{
int c= 0;
int numberCursor =number;
while(numberCursor>0)
  {
c++;
    
    numberCursor/10;
  }
int sum =0;
wihle(number>0)
  {
sum+= (int)Math.pow(number%10,c);
  number /=10;
  
  
  }
return sum == number;

  
}
