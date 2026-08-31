public class Test {

    // Method accepting parameters for addition
    static void add(int a, int b) {
        int result = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + result);
    }

    // Method accepting parameters for subtraction
    static void sub(int c, int d) {
        int result1 = c - d;
        System.out.println("The diff of " + c + " and " + d + " is: " + result1);
    }

    // Method accepting parameters for multiplication
    static void multi(int x, int y) {
        int result2 = x * y;
        System.out.println("The multiplication result of " + x + " and " + y + " is: " + result2);
    }

    // Method accepting parameters for division (using double for precise output)
    static void div(double s, double t) {
        if (t == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return;
        }
        double result3 = s / t;
        System.out.println("The division result of " + s + " by " + t + " is: " + result3);
    }

    public static void main(String[] args) {
        // First set of values
        System.out.println("--- Set 1 ---");
        add(10, 20);
        sub(20, 10);
        multi(5, 8);
        div(10, 5);

        // Second set of values (larger & negative numbers)
        System.out.println("\n--- Set 2 ---");
        add(150, 450);
        sub(100, 250);
        multi(-4, 12);
        div(45, 4);

        // Third set of values (decimal division handling)
        System.out.println("\n--- Set 3 ---");
        add(99, 1);
        sub(50, 12);
        multi(7, 7);
        div(10, 0); // Handles division by zero safely
    }
}
