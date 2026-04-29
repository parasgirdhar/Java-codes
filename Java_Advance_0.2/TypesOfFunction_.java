public class TypesOfFunction_{

public static int  Sum(int a, int b){   // return type is int ....
        int result = a+b;
            return result;

}

    public static void main(String []args){

    System.out.println(Sum(5,6));

    }
}

/* this both int and String function are Return type method ....... */


class call{

   public static String Concat(String  a, String b){     // return type is String ...
                      String res = a+b;
                      return res;
   } 



    public static void main(String []args){

       System.out.println(call.Concat("paras", "girdhar"));


    }
}

/* ............ Static method with parameters and return type ......................... */


class parameter{

public static int access(int r ,int  s){
   int result = r+s;
   return result;
}


public static void main(String []args){

int i=18;
int j=3;
int get =access(i,j);
System.out.println(get);

}
}



class fetch{

public static int multply(int m , int s){  // this m and s are parameters.....

            int mul = m*s;
               return mul;
}

    public static void main(String []args){

    int a = 56;
    int b = 89;
int mul = multply(a, b);  // calling a function multiply();  ...... this a and b are arguments .....
System.out.println(mul);

    }
}


class dell{

public static String cat(String  name){
      return ("hlo"+ name);
}
    public static void main(String []args){   // No input is given ....

 System.out.println(cat("paras"));

    }
}




class over{

          public static int Sum(int r , int z){
            return (r+z);
          }


public static int Sum(int a, int b , int c){
      return (a+b+c);
}

         
    public static void main(String []args){
  
            int d = Sum(10,12);
        System.out.println(d);       // “When two or more methods have the same name but different parameters (number, type, or order), it is called function overloading.”
        
        int m = Sum(2,4,7);
        System.out.println(m);

    }
}