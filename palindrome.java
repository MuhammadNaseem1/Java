import java.util.*;
class palindrome
{
    
    public static void main(String[] args)
    {
          Scanner s=new Scanner(System.in);
          String word=s.next();
          int length=word.length();
          String rev="";
          for(int i=length;i>0;i--)
          {
              rev=rev + word.charAt(i);
          }
          if(word.equals(rev))
          System.out.println("It is a palindrome");
          else
          System.out.println("It is a palindrome");
    }
}