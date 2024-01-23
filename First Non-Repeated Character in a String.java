String input = "agniag";


int[] indices  =  new indices[256];
for(int i=0;i<256;i++)
  {
    indices[i] = -1;
  }


for(int i = 0; i < input.Length; i++)
{

   char c = input.charAt(i);

  if (indices[c - 'a'] == -1)
  {
       indices[c-'a'] = i;
  }
  else
  {
 indices[c-'a'] = -2;
    
  }
}


int firstNonRepeatingIndex = Integer.MAX_VALUE;

foreach (int index in indices)
  {
if(index>0)
  {

  firstNonRepeatingIndex = Math.Min(firstNonRepeatingIndex, index);
  }

  
  }
