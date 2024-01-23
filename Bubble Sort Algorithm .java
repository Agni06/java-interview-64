void BubbleSortArray(int[] array)
{
  for(int i=0;i<array.length;i++)
    {
      for(int j=0;j<array.length-1-i;j++)
        {

          if(array[j]>array[j+1])
          {
            swap(array[j],array[j+1]);
            
          }
        }
    }
}
