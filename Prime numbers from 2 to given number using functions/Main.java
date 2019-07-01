import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      print_prime(n);
      
	}
  public static void print_prime(int m)
  {
    for( int i = 1; i <= m; i++)
    {
      int count = 0;
      for( int j=1; j<=i; j++)
      {
        if(i%j==0)
          count++;
        }
       // else if(j!=i)     
         // continue;
       // else 
        //  is_prime = 1;
    
      if( count == 2)
        System.out.println(i);
    }
  }
}
