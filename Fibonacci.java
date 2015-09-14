public class Fibonacci {
    public static int Fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        int[] fib = new int[n+1];
        fib[1] = 1;
        fib[2] = 1;
        for (int i = 3; i < fib.length; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];
    }
    
    public static void main(String[] args) {
        String error = "Usage: Fibonacci 'optional number' 'optional number'";
        int arg1 = -1;
        int arg2 = -1;
        if (args.length == 0) {
            arg1 = 1;
            arg2 = 5;
        } else if (args.length == 1) {
            try {
                arg1 = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println(error);
                return;
            }
            System.out.printf("Fibonacci %d: %d\n", arg1, Fibonacci(arg1));
        } else if (args.length == 2) {
            try {
                arg1 = Integer.parseInt(args[0]);
                arg2 = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.out.println(error);
                return;
            }
        } else {
            System.out.println(error);
            return;
        }
        int end = arg1;
        if (arg2 != -1) end = arg2;
        for (int i = arg1; i <= arg2; i++) {
            System.out.printf("Fibonacci %d: %d\n", i, Fibonacci(i));
        }
    }
}