import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int first = n/10;
      int last = n%10;
      int sum = first+last;
      System.out.println(sum);
	}
}