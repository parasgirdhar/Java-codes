// problem no : 9 on Leetcode........

class Solution {
    public boolean isPalindrome(int x) {
        
        String str= String.valueOf(x);
      int j=str.length()-1;
      boolean isbool=true;

      for(int i=0;i<str.length();i++){
        if(str.charAt(i)==str.charAt(j)){
            j--;
            isbool=true;
        }else{
            isbool=false;
               break;
        }
      }
       return isbool;

    }
}