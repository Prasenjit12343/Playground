import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum=0;
    int list[] = new int[n];
    for(int i=0;i<n;i++)
      list[i]=sc.nextInt();
    int  sum_of_first_3_elements = list[0]+list[1]+list[2];
    for(int i=1;i<=n/3-1;i++)
    {
      sum = 0;
      for(int j=3*i; j<=(3*i+2); j++)
      {
        sum = sum + list[j];
      }
      if(sum == sum_of_first_3_elements)
      {
        if(i!=n/3-1)
          continue;
        else
        {
          System.out.print("Perfect Batch");
          break;
        }
      }
      else
        System.out.println("Not a Perfect Batch");
    } 
  }
}