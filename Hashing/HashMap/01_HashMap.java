// ehde andar sara kuchh key value pair vich store hunda hai....

// value same ho sakde hai but key hamesha unique he rahuge...

import java.util.*;
class Main{
    public static void main(String []args){
        
        
        HashMap<String , Integer> map = new HashMap<>();  // syntax ..... 
        
        map.put("INDIA" , 28);
        map.put("pakistan" , 56);
        map.put("china" , 23);
        map.put("Russia" , 45);
        map.put("Japan" , 97);
        
        System.out.println(map); // ehy unordered hundy hai hashmap agr program vich india pehle likhya hai but output vich picche aa rhy hai ta ehy essy krke hi hai
        
        map.put("INDIA", 100); // It update the value of India ...
        // ethy hun put de 2 cases bnde hai agr ta value pehle to exist krde hai ta update hoju nhi ta nre va;lue insert hojugee...
         System.out.println(map); 
         
         // searching ..........
         
         if(map.containsKey("INDIA")){  // map.conatinsKey is used to search key in hashmap...
             System.out.println("yes it exist");
         }
         else{
             System.out.println("No it doesn't exist");
         }
         
        
         // get is used to check value of that key.... // map.get is used to find value of existing key ....
         
         System.out.println(map.get("pakistan"));// if exist it return value but if not than it return null ...
         
         
         // Iterator forloop for Hasmap....
         
         for(Map.Entry<String , Integer>  exist : map.entrySet()){ // exist de andar hun sare pairs hai jo exist krde hai hashmap de vich...
             System.out.println(exist.getValue());  // it give all values exist is hasmap...
             System.out.println(exist.getKey());     // it give all Key exist is hasmap...
             
         }
             
             // hun ek hor tareka keys nu print kran vasty keyset....
             
             Set <String> keys = map.keySet();
             for(String key : keys){
                 System.out.println("these all are keys exist in key set :" + + map.get(key));
         }
             
             map.remove("pakistan");   // used for remove element from hashmap....
             System.out.println(map);   
         
    }
}






