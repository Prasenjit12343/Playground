import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    for(int i=0;i<n;i++)
      list[i]=in.nextInt();
    int max, index=0;
    if(list[1] > list[2])
      max = list[1];
    else
      max = list[2];
    for(int i=2; i<n; i++)
       {
         if(list[i] > max)
         {
           max = list[i];
           index = i;
         }
       }
     System.out.println(index);
          
}
 }
       