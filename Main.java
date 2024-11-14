import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Put your solutions below
    System.out.println(countSub("gagagigo the risen","ga"));
    System.out.println(countProperContains("bada the badaboom the bobadabo baby","bada"));
    System.out.println(deleteSub("gagagigo the giga Risen","gig"));
  }

  public static int countSub(String word, String target)
  {
    int count = 0;
    for (int i = 0; i<word.length()-(target.length()-1); i++)
    {
      String L = word.substring(i,i+target.length());
      if (L.equals(target))
      {
        count ++;
      }
    }
    return count;
  }

  public static int countProperContains(String word, String target)
  {
    int count = 0;
    int n = target.length();
    for (int i = 0; i<word.length() - (n-1); i++)
    {
      String L = word.substring(i,i+n);

      boolean beginOrSpaceBefore;
      beginOrSpaceBefore = (i==0) || word.substring(i-1,i).equals(" ");
      // checks if at the beginning or if the thing behind is a space  

      boolean endOrSpaceAfter; 
      int endOfTarget = i + target.length();
      endOrSpaceAfter = (endOfTarget == word.length()) || word.substring(endOfTarget, endOfTarget+1).equals(" "); 

      if ((beginOrSpaceBefore && endOrSpaceAfter) && L.equals(target))
      {
        count ++;
      }
    }

    return count;
  }

  public static String deleteSub(String word, String target)
  {
    while (word.indexOf(target) != -1)
    {

      word = word.substring(0, word.indexOf(target)) + word.substring(word.indexOf(target) + target.length());
    }
    return word; 
  }
  
}
