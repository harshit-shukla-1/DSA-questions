import java.util.Scanner;
public class Lect2b {

    public static void prefix_max(int[] arr){

        Scanner sc = new Scanner(System.in);
        int arr_length = arr.length;

        for(int i=1;i<arr_length;i++) {
            if (arr[i - 1] > arr[i])
                arr[i] = arr[i - 1];

        }
        System.out.println("Enter the number of queries");
        int number_of_queries = sc.nextInt();
        for(int i=0;i<number_of_queries;i++)
        {
            System.out.println("Enter the index");
            int index = sc.nextInt();
            if(index<0 | index>=arr_length)
            {
                System.out.println("Index out of bound");
                break;
            }
            else {
                System.out.println("The maximum value for the index " + index + " is " + arr[index]);
            }
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int array_size = sc.nextInt();
        int[] arr = new int[array_size];
        System.out.println("Enter the values of the array");
        for(int i=0;i<array_size;i++)
        {
            arr[i] = sc.nextInt();
        }

        prefix_max(arr);
    }
}
