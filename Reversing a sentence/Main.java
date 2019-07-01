import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int str_len = sb.length();
      int start_idx = 0;
      reverse_string(sb, 0, str_len-1);  //Reversed the whole string
      for(int i = 0; i < str_len; i++)
      {
        if(sb.charAt(i) ==' ')
        {
          int end_idx = i-1;
          reverse_string(sb, start_idx, end_idx);
          start_idx = i + 1;
        }
        if( i == str_len-1 )
        {
          int end_idx = i;
          reverse_string(sb, start_idx, end_idx);
        }
      }
      System.out.println(sb);
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
      int front = start_idx;
      int end = end_idx;
      while(front<end)
      {
        char ch = sb.charAt(front);
        sb.setCharAt(front, sb.charAt(end));
        sb.setCharAt(end, ch);
        front++;
        end--;
      }
    }
}