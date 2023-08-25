public class Fibonacci {
    public static void main(String[] args) {
        int number = 8;
        System.out.println("Stelle: " + number + " FibZahl: " + getFibonacci(number));
    }

    public static int getFibonacci(int n) {
        if(n < 2) {
            return n;
        }
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

}
