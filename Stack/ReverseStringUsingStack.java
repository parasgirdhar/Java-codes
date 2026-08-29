
// Normal type .....

import java.util.*;

class ReverseStringUsingStack{
    public static void main(String []args){


String s = "Love babar";

Stack <Character> data = new Stack <>();

for(int i=0;i<s.length();i++){
    data.push(s.charAt(i));
}


String get = "";

while(!data.isEmpty()){
 get = get + data.pop();
}



System.out.println(get);


    }
}


  // Method type .........

import java.util.Stack;

class ReverseStringUsingStack{

     
     String get(String s ){

         Stack <Character> ref = new Stack <>();

         for(int i=0;i<s.length();i++){
            ref.push(s.charAt(i));
         }
         String fetch = " ";
              
            while(!ref.isEmpty()){
            fetch = fetch + ref.pop();
            }
                 
               return fetch;
    }

    public static void main(String []args){

          String s = "Again this is love babar";

 ReverseStringUsingStack elem = new ReverseStringUsingStack();

                 String result =   elem.get(s);
                 System.out.println(result);

    }
}



