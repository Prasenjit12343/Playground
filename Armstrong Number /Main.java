import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int temp = num;
      int sum = 0, count=0;
      while(num>0)
      {
        num = num/10;
        ++count;
      }
      num = temp;
      while(num>0)
      {
        int last_digit = num%10;
        int  product =1;
        for(int i=0; i<count; i++)
        {
        product = product * last_digit;
        }
        sum = sum + product;
        num = num/10;
      }
      if( temp == sum)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");

	}
}