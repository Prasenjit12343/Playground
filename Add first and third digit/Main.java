import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int firstdigit = n/100;
      int lastdigit = n%10;
      int sum = firstdigit + lastdigit;
      System.out.println(sum);

	}
}