// Find Factorial of a given number by Recursion...


class Fact {

    public static void Call(int n, int i, int factorial) {

        if (i > n) {
            System.out.println("Final Answer = " + factorial);
            return;
        }

        factorial = factorial * i;
        System.out.println(factorial);

        Call(n, i + 1, factorial);    //  i is increased........
    }

    public static void main(String[] args) {
        Call(5, 1, 1);
    }
}
