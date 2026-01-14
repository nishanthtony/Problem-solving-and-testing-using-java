class Solution {
    public int countSeniors(String[] details) {

        int no_of_snr = 0;

        for(String temp : details)
        {
            if(Integer.parseInt(temp.substring(11,13))>60)
            {
                no_of_snr++;
            }
        }

        return no_of_snr;
        
    }
}
