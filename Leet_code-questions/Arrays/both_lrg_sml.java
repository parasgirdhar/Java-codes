class mainclass {
    public static void main(String[] args) {
        
        int nums[] = {3,4,6,8,7,9,-78,-65,-6,0,2};

        int smallest = Integer.MAX_VALUE;  // it is assumed as infinity...
        int largest = Integer.MIN_VALUE;   // it is assumed as -infinity.....

        for(int i = 0; i < nums.length; i++) {
            smallest = Math.min(nums[i], smallest);
            largest = Math.max(nums[i], largest);
       

        }

        System.out.println("This is the largest value : " + largest);
        System.out.println("This is the smallest value : " + smallest);

       
    }
}
