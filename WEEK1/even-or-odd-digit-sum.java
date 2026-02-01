
class DigitSumOpt{
    public static void main(String[] args) {
        
        int num=2547;
        
        int odd_sum=0;
        int even_sum=0;
        
        while(num>0){
            
            int temp =  num-((num/10)*10);
            
            if(temp%2==0){
                even_sum+=temp;
            }
            else{
                odd_sum+=temp;
            }
            
            num=num / 10;
        }
        
        if(even_sum>odd_sum){
            System.out.println("EVEN_SUM:"+even_sum);
        }
        
        else{
            System.out.println("ODD_SUM:"+odd_sum);
        }
        
    }
}
