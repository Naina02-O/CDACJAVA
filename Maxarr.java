import java.util.Scanner;
public class Maxarr{
     public static int findMax(int[] arr) {
        int max = arr[0];
          for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; 
            }
        }
    return max;
        
    }

    public static void main(String[] args) {
        
		Scanner s = new Scanner(System.in);
        int[] n = new int[10];
        System.out.println("Enter integers:");
        for (int i = 0; i < n.length; i++) {
            n[i] = s.nextInt();
        }

		int max = findMax(n);
        System.out.println("max element from the array: "+max);
		s.close();
        
        
    }
}