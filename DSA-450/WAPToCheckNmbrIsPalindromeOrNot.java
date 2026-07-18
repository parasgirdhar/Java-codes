class Main{
    public static void main(String []args){
        int num = 131;
        int original = num;
        int reverse = 0;
        
        while(num>0){
            int rem = num %10;
            
            reverse=reverse*10+rem;
            num = num/10;
        }
        if( original == reverse){
            System.out.println("yes it is palindrome");
        }else{
            System.out.println("No It's not");
        }
        
        
    }
}