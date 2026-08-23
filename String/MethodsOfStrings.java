import java.util.*;
class MethodsOfStrings{
    public static void main(String []args){



String test = "java is easy";


// .length() ....


System.out.println(test.length()); // it also count space ..


// .charAt() ...   check particular character on particular index ..

System.out.println(test.charAt(0)); // it start count from 0 ..


System.out.println(test.substring(0,5));
// here 0 is starting index and 5 is last index which is always endIndex-1 by default ...





String res = test.substring(0,7);

System.out.println(res);



String get = "elem is good thing"; // created new string 

char[] ref = get.toCharArray();

System.out.println(ref[8]);







    }
}