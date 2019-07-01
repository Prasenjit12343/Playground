import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int num = 1;
      int temp = n;
      int count = 0;
      int first_digit=0;
      
      if ( n ==0 )
         System.out.println(n);
       else
       {
         int last_digit = n % 10;
         while ( n > 0 )
        {
             n = n/10;
            
            if( n!=0)
              first_digit = n;
           
         }
         
      int sum = first_digit + last_digit;
      System.out.println(sum);
       }
	}
}