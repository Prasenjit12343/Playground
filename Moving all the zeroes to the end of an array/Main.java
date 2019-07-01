import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      for( int i = 0; i <size; i++ )
        arr[i] = in.nextInt();
      segregate_zeros(size, arr);
      for(int i = 0; i<size; i++)
        System.out.print(arr[i]+" ");
    }
  public static void segregate_zeros(int size, int arr[])
  {
    int zero_count = 0;
    for(int i = 0; i<size; i++)
    {
      if(arr[i] == 0)
        zero_count++;
    }
   for( int j=0,i=0; i < (size - zero_count); j++)
    {
      if(arr[j]>0)
      {
        arr[i] = arr[j];
        i++;
      }
    }
    for(int k = (size - zero_count); k <size; k++)
    {
      arr[k]=0;
    }
  }
}