class Main{
    public static void main(String []args){
        int n = 7;
        
        int curr=0;
        int prev = 1;
        for(int i=0;i<n;i++){
            System.out.println(curr);
            int next = curr + prev; 
            curr = prev;
            prev = next;
        }
        
    }
}

// output => 0,1,1,2,3,5,8,13 .....

