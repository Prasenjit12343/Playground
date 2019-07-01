import java.util.Scanner;
class Main {
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for ( int i=1; i <= n; i++)
      {
        if( i % 2 == 1 )
          System.out.println(i);
      }
	}
}