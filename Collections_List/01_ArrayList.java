// import java.util.ArrayList;
// import java.util.Collections;
import java.util.*;

class Main{
    public static void main(String []args){
        
        ArrayList<Integer> list = new ArrayList<>();
                              // performing add operation in arrayList.......
         list.add(9);
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(1);


        list.add(0,56);         // used to add element inside in arrayList....
        
        System.out.println(list);

                                 // set element in arrayList............

        list.set(5,72);
        System.out.println(list);

                      // for delete an element we use .remove in arrayList........

        list.remove(0);
        System.out.println(list);

        list.remove(4);
        System.out.println(list);



                              // used to check the size of an arrayList...........
     int size = list.size();
     System.out.println(size);



     for(int i=0;i<list.size();i++){           // apply for loop on full ArrayList.......
        System.out.println(list.get(i));
     }


     Collections.sort(list);   // this is for sorting and also use util line on header files 
     System.out.println(list);

     // best way to use import all lines with * symbol.....
    }
}