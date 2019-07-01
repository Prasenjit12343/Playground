import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int greatest;
      greatest=find_greatest(n1,n2);
      greatest=find_greatest(greatest,n3);
        System.out.println(greatest);
	}
  public static int find_greatest(int a, int b)
  {
    if(a<b)
      return b;
    else
      return a;
  }
}
