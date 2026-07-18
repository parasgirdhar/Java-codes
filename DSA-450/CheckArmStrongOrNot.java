class Main{

public static void Arm(int num){

int elem = num;
int rev =0;

while(num>0){
int rem = num%10;
rev = rev+(rem*rem*rem);
num = num/10;

}

if(elem == rev){
  System.out.println("yes it is armStrong");
}else{
  System.out.println("No it is n't armStrong");
}

 return ;

}

 public static void main(String []args){

int num = 371;

Arm(num);

  }
}