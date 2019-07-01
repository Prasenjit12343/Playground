import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int exponent = in.nextInt();
      int result = find_power(base, exponent);
      System.out.print(result);
	}
  public static int find_power(int n, int m)
  {
    int result = 1;
    for(int i = 1; i <= m; i++)
    {
      result = result * n;
    }
    return result;
  }
  
}