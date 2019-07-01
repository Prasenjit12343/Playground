import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      
      for( int row_no = 1; row_no <= n; row_no++)
      {
        int num = n-row_no+1;
        for(int col_no = 1; col_no <= n-row_no+1; col_no++ )
        {
          System.out.print(num);
          num--;
        }
        System.out.print("\n");
      }
	}
}