import java.util.Scanner;
class Main {
	public static void main (String[] args){
    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for( int row = 1; row <= n; row++)
      {
        for( int col = 1; col <= n; col++)
        {
          if(((row%2==0)&&(col==1))||((row%2==1)&&(col==n)))
            System.out.print(row+1);
          else
            System.out.print(row);
        }
            System.out.print("\n");
      }
	}
}