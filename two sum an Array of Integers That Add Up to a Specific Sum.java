int[] array = { 5, 2, 1, 5, 8, 5, 1, 7, 7, 0 };
void PrintPairs(int[] array, int sum)
{
for(int i=0;i<array.length;i++)
  {
    for(int j=i+1;j<array.length;j++)
      {
        if(array[i] + array[j] == sum)
        {
          System.out.println(array[i] + " " + array[j]);
          break;
          
        }
      }
  }

  
}
