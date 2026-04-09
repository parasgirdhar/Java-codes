public class CheckPalindromeString {
    
    public static void main(String[] args) {


String str="NITIN";

int left=0;
int right=str.length()-1;

boolean isbool= true;

while(left < right) {
if(str.charAt(left)!= str.charAt(right)){
     isbool = false;
        break;
}
     left++;
     right--;  
}

     if(isbool){
        System.out.print("true");
     }
     else{
        System.out.println("false");
     }
  }
}

