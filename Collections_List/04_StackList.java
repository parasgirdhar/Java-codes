import java.util.*;

class Main{
  public static void main(String []args){

  Stack <Integer> list = new Stack<>();

   list.push(8);
   list.push(4);
   list.push(1);
   list.push(89); // last in first out ....

   list.pop();    // Remove last element ......
   list.pop();     // remove second last element ..........


    System.out.println(list);
    System.out.println(list.peek()); // tells the top of stack .... the element which is on the top of stack here it is 89....
  }
}