// most important advatage is that vector is synchronized and ArrayList is not synchronized....

import java.util.*;

class Main{
    public static void main(String []args){

  Vector <Integer> list = new Vector<>(6, 2); // 6 is the reserved memory in vector ...
  // in these agr (6,2) mikha hai iss da matlab first one 6 is capacity agr ehy cross hunde hai ta 2 hor memory add hojy matlab total 8 it will save memory from wastage .....

  list.add(3);
  list.add(3);     
  list.add(3);
  list.add(3);
  list.add(3);
//    list.add(3);
  list.add(3);
  list.add(3);  // If elements cross the capacity than it become double ... 6 => 12 , 5 => 10....



     System.out.println(list.capacity());  // used to check the capacity of vector which is not possible in ArrayList....

    }
}