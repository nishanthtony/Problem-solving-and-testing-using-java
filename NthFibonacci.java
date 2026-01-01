import java.util.Scanner;

class NthFibonacci{
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the K_value: ");
        int len = sc.nextInt();
        
        int first=0;
        int second=1;
        int temp=0;
        
        for(int i=2; i<=len ; i++){
            
            temp=first+second;
            first=second;
            second=temp;
          
        }
        
        System.out.print("Nth_Fibonacci ="+temp);
    }
}
