class Main{
    
      public static void sum(int num){
            int digit = 0;
            while(num !=0){
                digit = digit + num%10;
                num = num/10;
               
            }
            System.out.println(digit);
        }
        
    public static void main(String []args){
        
      int num = 123;
    
     sum(num);
    
    }
}