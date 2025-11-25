import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Vector<Integer> nums = new Vector<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);

        System.out.println("Vector elements:");
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        System.out.println("Size: " + nums.size());

        nums.remove(1); // remove element at index 1

        System.out.println("After removal: " + nums);
    }
}
