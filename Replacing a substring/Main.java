import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();
      String str1 = scan.nextLine();
      String str2 = scan.nextLine();
      System.out.print(str.replace(str1, str2));
    }
}