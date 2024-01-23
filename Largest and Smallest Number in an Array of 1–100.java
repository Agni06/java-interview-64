int[] array = new int[100];
for (int i = 0; i < 100; i++)
  {
   array[i] = i + 1;
  }

int largestNumber = Integer.MIN_VALUE;
int smallestNumber = Integer.MAX_VALUE;

for(int i=0;i<100;i++)
  {
largestNumber = Math.max(array[i],largestNumber);
    smallestNumber = Math.min(array[i],smallestNumber);
    
    
  }

System.out.println(largestNumber + " " + smallestNumber);


