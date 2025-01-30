public class SwapVariables {
    public static void main(String[] args) {
        // Initialize two variables
        int a = 5;
        int b = 10;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Use a third variable to swap
        int temp = a; // Store the value of a in temp
        a = b;        // Assign the value of b to a
        b = temp;     // Assign the value of temp (original a) to b

        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
