// remove all digit from a number one by one from back side and return from front side...

class Main{

static void PrintDigit(int num){

while(num !=0){
 int digit = num%10;

 System.out.println(digit);

 num = num/10 ;

}
}

    public static void main(String[] args) {
        
 int num = 3457; 

PrintDigit(num);
    }
}


