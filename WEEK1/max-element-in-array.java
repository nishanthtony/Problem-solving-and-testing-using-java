class Max_Element{
    public static void main(String[] args) {
        
        int[] arr={10,11,12,13,14};
        
        int max=arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("MAXIMUM_ELEMENT_IN_ARRAY: "+max);
    }
}
