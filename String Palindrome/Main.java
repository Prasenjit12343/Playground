import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();
      StringBuilder sb = new StringBuilder(str);
      StringBuilder temp = new StringBuilder("");
      int str_len = sb.length();
      for(int i = str_len-1; i >= 0; i--)
      {
        temp.append(sb.charAt(i));
      }
      boolean is_matching = true;
      for(int i = 0; i < str_len; i++)
      {
        char ch = temp.charAt(i);
        if(ch!=sb.charAt(i))
        {
          is_matching = false;
          break;
        }
      }
      if(is_matching == true)
        System.out.println("Yes");
      else
        System.out.println("No");
    } 
}