import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
       int n = in.nextInt();
      int sum = sum_of_numbers(n);
      System.out.println(sum);
	}
  public static int sum_of_numbers(int m)
  {
    int sum = 0;
    for(int i = 1; i <= m; i++)
      sum = sum + i;
    return sum;
  }
  }
 