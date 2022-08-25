public class static_variables_methods_and_blocks {
    static void Addition(int a, int b){   // Method
        int sum =a+b;                     // inside every curly braces are called blocks
        System.out.println(sum);
    }
    static {
        System.out.println("Welcome to day 1 assignment");
    }

    public static void main(String[] args) {
        Addition(20,30); // values are called Arguments
    }
}
