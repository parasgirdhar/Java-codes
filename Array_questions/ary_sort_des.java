// sort array in descending order...

import java.util.Arrays;
import java.util.Collections;

class des_array{
    public static void main(String[] args) {
        
Integer arr[]={2,6,4,8,7,9,2,8,1,3};


 Arrays.sort(arr, Collections.reverseOrder());

System.out.println(Arrays.toString(arr));

    }
}

