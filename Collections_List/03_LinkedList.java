import java.util.*;

class Main{
  public static void main(String []args){

  LinkedList<Integer> list = new LinkedList<>();

  list.add(2);
  list.add(4);          // add element ....
  list.add(6);
  list.add(8);
  System.out.println(list);

  list.remove(1); // remove element ....
  System.out.println(list);


   list.set(1,56);               // set element in list ........
   System.out.println(list);

System.out.println(list.get(1));  // get element through index value .....

   int elem = list.size();
   System.out.println(elem);   // used to check the size of an linked list......

  }
}