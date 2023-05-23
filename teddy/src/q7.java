class MyCalculator {
    public long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero");
        } else {
            return (long) Math.pow(n, p);
        }
    }
}

public class q7 {
    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();

        try {
            long result1 = calculator.power(2, 3);
            System.out.println("2^3 = " + result1);

            long result2 = calculator.power(0, 0); // Throws exception
            System.out.println("0^5 = " + result2);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
