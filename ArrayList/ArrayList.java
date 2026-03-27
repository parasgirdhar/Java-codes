import java.util.ArrayList;
import java.util.Collections;


public class Arraylist {
    
public static void main(String []args){



// ArrayList<Integer> list=new ArrayList<>();

// list.add(9);
// list.add(2);
// list.add(3);
// list.add(7);

// System.out.println(list);

// int element=list.get(0);
//  System.out.println(element);


ArrayList<Integer>data=new ArrayList<>();          //  making of ArrayList...

   data.add(1);
   data.add(45);              // creation of array list.....
   data.add(96);
   data.add(12);

   data.add(1, 87);          // add element into particular index value..
   data.add(4, 155);

   System.out.println(data);

int fetch=data.get(0);          // get Element of Particular index in a list..using (.dot get);

System.out.println(fetch);



data.set(0, 678);
System.out.println(data);             // set is used to change data on particular index in a list...

data.remove(2);
System.out.println(data);             // It remove particular element from list with index value... 



System.out.println(data.size());            // it tell the size of ArrayList...



for(int i=0;i<data.size();i++){
    System.out.print(data.get(i));               // print our full list with for loop ......
}


Collections.sort(data);
System.out.print(data);             // sort our list ...

}

}
