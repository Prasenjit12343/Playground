import java.util.Scanner;
public class Main{
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int gcd1=find_gcd(n1,n2);
      int gcd=find_gcd(gcd1,n3);
      System.out.println(gcd);
	}
  public static int find_gcd(int a, int b)
  {
    int min,gcd=0;
    if(a<b)
      min = a;
    else 
      min = b;
    while(min>=1)
    {
      if((a%min==0)&&(b%min==0))
    {
      gcd=min;
      break;
    }
    min--;
  }
    return gcd;
}
}