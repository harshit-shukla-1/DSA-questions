import java.util.Scanner;
public class Lect2a {

public static void prefix_sum(int[] arr){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of queries you want");
    int number_of_queries = sc.nextInt();
    int arr_length = arr.length;
    for(int i = 1;i<arr_length;i++) {

       arr[i] += arr[i-1];

    }
    for(int i = 0;i<number_of_queries;i++) {
        System.out.println("Enter the value for first index");
        int left_index = sc.nextInt();
        System.out.println("Enter the value for last index");
        int right_index = sc.nextInt();
        if (left_index < 0 | right_index < 0 | right_index > arr_length | left_index > arr_length) {
            System.out.println("Index out of bound");
            break;
        } else {
            int sub_array_sum = arr[right_index] - arr[left_index - 1];
            System.out.println("The sum of the subarray is : " + sub_array_sum);
        }
    }

}


public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array");
int array_size = sc.nextInt();
int[] array = new int[array_size];
System.out.println("Enter the values for the array");

for(int i=0;i<array_size;i++){
    array[i] = sc.nextInt();
}

prefix_sum(array);

}
}


