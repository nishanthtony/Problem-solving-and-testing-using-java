public class binary_search{
    
    static Boolean find_element(int[] arr,int n,int target,int low,int high)
    {
        while (low <= high) {
            int mid = (low + high) / 2;

            if (target == arr[mid]) {
                
                return true;
                
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else{
                low = mid + 1;
            } 
        }
        
        return false;
        
    }
    
    public static void main(String args[]) {
        
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = 7;
        int target = 0;
        int low = 0;
        int high = n - 1;
        Boolean result= find_element(arr,n,target,low,high);
        
        if (result){
            System.out.println("Element found!!");
        }
        else{
            System.out.println("Element not found");
        }
        
        
    }
}