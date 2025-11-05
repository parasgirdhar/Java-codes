// WAP to stop duplication in an given array....

public class stop_dupli_ {
    public static void main(String[] args) {

        int arr[] = {2, 3, 7, 6, 8, 8, 9, 2};

        System.out.println("Unique elements in array are:");

        // Outer loop: har element ko ek ek karke lo
        for (int i = 0; i < arr.length; i++) {

            boolean amron = false;  // assume karo number unique hai

            // Inner loop: check karo kya ye number pehle aa chuka hai
            for (int j = 0; j < i; j++){        

                if (arr[i] == arr[j]) {
                    amron = true;  // agar pehle mil gaya, to ye duplicate hai                    
                    break; 
                } 
            } 
            // Agar duplicate nahi mila, to print karo 
            if (amron == false) { 
                System.out.print(arr[i] + " ");  
            } 
        } 
    } 
}

