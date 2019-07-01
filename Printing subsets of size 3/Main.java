import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       int arr_size = in.nextInt();
       int arr[] = new int[arr_size];
       for(int index = 0; index <= arr_size - 1; index++){
           arr[index] = in.nextInt();
       }
       // Function call
       subsets_of_size_3(arr_size, arr);
    }
    public static void subsets_of_size_3(int arr_size, int arr[])
    {
        for(int i = 0; i <= (arr_size - 2); i++)
        {
            for(int j = i + 1; j <= (arr_size - 1); j++)
            {
                for(int k = j + 1; k <= (arr_size - 1); k++)
                {
                    System.out.print("(" + arr[i] + "," + " " + arr[j] + "," + " " + arr[k] + ")" + " ");
                }
            }
            System.out.println();
        }
    }
}