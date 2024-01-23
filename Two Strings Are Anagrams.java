import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    String str1 = "Race";
    String str2 = "Care";
    if(str1.length()==str2.length())
    {
char[] c1 = str1.toCharArray();
      char[] c2 = str2.toCharArray();
      Arrays.sort(c1);
      Arrays.sort(c2);
      boolean result = Arrays.equals(c1,c2);
       if(result) {
        System.out.println(str1 + " and " + str2 + " are anagram.");
      }
      else
       {

         System.out.println(str1 + " and " + str2 + " are not anagram.");
       }
      
    }
    else {
      System.out.println(str1 + " and " + str2 + " are not anagram.");
    }

  }
}
