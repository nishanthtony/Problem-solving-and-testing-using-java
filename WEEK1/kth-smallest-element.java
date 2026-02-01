import java.util.Scanner;
import java.util.Arrays;

class Kth_smallest_element{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[] arr={11,12,15,17,14};
        Arrays.sort(arr);
        
        System.out.println("N = 5(ENTER THE K VALUE LESS THAN N !!!)");
        System.out.println("ENTER THE K ELEMENT:");
      
        int k = scan.nextInt();
        
        System.out.println("Kth_SMALLEST_ELEMENT_IN_ARRAY: "+arr[k-1]);
    }
}
