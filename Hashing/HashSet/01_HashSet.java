// Major advanatge of HashSet is that it took equal time for insertion, deletion and Searching......O(1)

// may be in worst case it took O(n)......

// It only contains or keep unique elements it did not allow duplication ......

// ehda Iterator didn't guranetee ke return krde time elements sorted order vich ve ho sakde hai te nhi ve ...
// In iterator we do not need i++ or i-- he perform all by Own......



// Conations..  -> (Searching ....)
// add     -> (Insertion....)
// remove  -> (deletion...)
// size    -> (Check size .....)
// Iterator  -> (Perform forloop .....)
 

import java.util.*;

class Main{
    public static void main(String []args){

        HashSet <Integer> set = new HashSet<>();

           set.add(1);
           set.add(6);
           set.add(8);


           // searching -> conatins
           
           if(set.contains(6)){
            System.out.println("yes it contains");
           }
           if(!set.contains(6)){
            System.out.println("No it doesn't contain");
           }
           
           set.remove(8);      // Removing 8 .........
           
           if(!set.contains(8)){
               System.out.println("yes it is removed"); // checking 8 is removed
           }
           
           System.out.println("size of set is :" + + set.size()); // checking size of set...
           
           System.out.println(set); // print all elements of set.......
           
           
           
           Iterator it = set.iterator();
           while(it.hasNext()){
               System.out.println(it.next());
           }
           
           // Initially iterator point kr rhya hundy null nu but it.next points null da next and it.hasNext points to ke jithe koi elements nhi bachda sare khatam ho jande hai ....
    }
}



