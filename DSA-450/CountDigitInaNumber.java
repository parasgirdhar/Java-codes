class CountDigitInaNumber{
    
    static void DigitCounter(int num){
        int counter = 0;
        
        
        if(num == 0){
            System.out.println("1");
            return;
        }
      
        while(num !=0){
        int res = num/10;
        num = res;
        counter++;
        }
        System.out.println(counter);
    }
    
    public static void main(String []args){
        int num = 0;
        DigitCounter(num);
        
    }
}