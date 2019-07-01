import java.util.Scanner;
class Main
{
    public static int squre_of_n(int m)
    {
      int num = m*m;
      return num;
    }
	public static void main (String[] args)
    {
	  Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int value = squre_of_n(n);
      System.out.println(value);
	} 
}