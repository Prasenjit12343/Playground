import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
     int sum = 0;
      int temp = num;
      while( num>0 )
      {
         int digit_fact=1;
        int last_digit = num%10;
        if(last_digit == 0)
          digit_fact = 1;
        else
        {
          for( int i=1; i<=last_digit; ++i)
          {
            digit_fact = digit_fact * i;
          }
        }
        sum = sum + digit_fact;
        num = num/10;
      }
      if(sum == temp)
        System.out.println("Yes");
      else
        System.out.println("No");
     
	}
}