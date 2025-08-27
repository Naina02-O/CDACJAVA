import java.util.Scanner;

public class sortArrAscending {

    // Method to sort array in ascending order
    public static void sortArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] n = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < n.length; i++) {
            n[i] = s.nextInt();
        }

        sortArray(n);

        System.out.println("Sorted array in ascending order:");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }

        s.close();
    }
}
