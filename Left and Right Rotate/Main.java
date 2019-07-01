import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    Scanner in = new Scanner (System.in);
    int size = in.nextInt();
    int arr[] = new int[size];
    for(int i = 0;i<size; i++)
      arr[i] = in.nextInt();
    int rotation_no = in.nextInt();
    rotate_odd_right(size,arr,rotation_no);
    rotate_even_left(size,arr,rotation_no);
    for( int i = 0; i<size; i++)
       System.out.print(arr[i]+" ");
  	}
    public static void rotate_odd_right(int size,int arr[], int no_rotation)
    {
       for( int i=1;i<=no_rotation;i++)
      {
         int temp,j;
         if(size%2==0)
         {
           temp = arr[size-2];
           for(j=size-2;j>=2;j=j-2)
             arr[j] = arr[j-2];
         }
         else
         {
           temp = arr[size-1];
           for( j = size-1; j>=2; j= j-2)
             {
                  arr[j] = arr[j-2];
             }
          }
         arr[j]=temp;
      }
    }
    public static void rotate_even_left(int size, int arr[], int no_rotation)
    {
      for( int i=1;i<=no_rotation;i++)
      {
        int temp,j;
        temp = arr[1];
        for( j = 3; j<size; j= j+2) 
        {
          arr[j-2] = arr[j];
        }
        arr[j-2]=temp;
      }
     } 
    }
 