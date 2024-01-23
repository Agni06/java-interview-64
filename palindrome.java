boolean IsPalindrome(string input)
  {
char[] s1 = input.toCharArray();

for(int i=0;i<s1.length/2;i++)
  {
if(s1[i]!=s1[s1.length-1-i]){
    return false;
  }
  return true;

  
  }
