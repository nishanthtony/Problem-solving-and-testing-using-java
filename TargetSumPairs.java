import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


class TargetSumPairs{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        List<List<Integer>> result = new ArrayList<>();
        
        int[] arr={0,1,2,3,4,5,6,7,8,9};
        
        int target = 6;
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    List<Integer> pair=new ArrayList<>();
                    
                    pair.add(arr[i]);
                    pair.add(arr[j]);
                    
                    result.add(pair);
                }
                
            }
        }
        
        for(int k=0 ; k<result.size() ; k++)
        {
            System.out.println(result.get(k));
        }
    }
}
