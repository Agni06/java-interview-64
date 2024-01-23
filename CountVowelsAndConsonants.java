void CountVowelsAndConsonants(String input, out int numVowels, out int numConsonants)
  {
  numConsonants=0;
  numVowels=0;
char[] c = input.toCharArray();
  for(int i=0;i<c.length;i++)
  {
if(c[i]=='a' || c[i] == 'e' ||  c[i] == 'i' ||  c[i] == 'o' ||  c[i] == 'u')
{
numVowels++;


  
}
    else
{
  numConsonants++;
  
}
  }
}
