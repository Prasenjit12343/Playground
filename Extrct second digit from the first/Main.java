import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count =0;
      int digit = 0;
      int i=1;
      int temp = n;
      if( n==0 )
        System.out.println(n);
      else
      {
         while( n>0)
         {
              count = count +1;
              n = n/10;
         }
          n = temp;
         while( i <= (count-1) )
        {
             digit = n%10;
             n = n/10;
             i=i+1;
         }
         System.out.println(digit);
      }
	}
}