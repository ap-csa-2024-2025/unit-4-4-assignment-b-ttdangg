import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Put your solutions below
  }

  public static int countSub(String word, String target)
  {
    String s = "gagagigo the risen";
    String target = "ga";

    int count = 0;
    for (int i = 0; i<s.length()-(target.length()-1); i++)
    {
      String L = s.substring(i,i+target.length());
      if (L.equals(target))
      {
        count ++;
      }
    }
    return count;
  }

  public static int countProperContains(String word, String target)
  {
    
    return 0;
  }

  public static String deleteSub(String word, String target)
  {
    return null;
  }
}
