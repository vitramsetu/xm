class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    // Empty class body since it inherits the 'add' method from Arithmetic
}

class q6 {
    public static void main(String[] args) {
        Adder adder = new Adder();
        Arithmetic arithmetic = adder; // Upcasting

        // Print superclass name
        System.out.println("My superclass is: " + arithmetic.getClass().getSuperclass().getName());

        // Perform addition using the 'add' method
        int sum = arithmetic.add(42, 13);
        System.out.println("42 + 13 = " + sum);

        // Perform addition using the 'add' method in Adder class
        int sum2 = adder.add(13, 20);
        System.out.println("13 + 20 = " + sum2);
    }
}
