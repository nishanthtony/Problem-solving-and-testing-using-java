class Solution {

    public static int get_next(int n)
    {
        int sum=0;

        while(n>0)
        {
            int digit=n%10;
            sum= sum + digit*digit;
            n=n/10;
        }

        return sum;

    }
    public boolean isHappy(int n) {

        int slow=n;
        int fast = get_next(n);


        while(fast!=1 && slow!=fast)
        {
            slow=get_next(slow);
            fast=get_next(get_next(fast));
            
        }

        return fast==1;
        
        
    }
}
