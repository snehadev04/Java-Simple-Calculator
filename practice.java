// Calculator class with an add method to perform addition
class calculator {
    int a;

    // Method to add two numbers
    public int add(int n1, int n2) {
        int r = n1 + n2;  // Add the two numbers
        return r;  // Return the result
    }
}

public class practice {
    public static void main(String[] args) {
        int num1 = 45;  // First number
        int num2 = 67;  // Second number

        // Create an instance of the Calculator class
        calculator calc = new calculator();

        // Call the add method of the Calculator class to perform addition
        int result = calc.add(num1, num2);

        // Print the result of the addition
        System.out.println(result);
    }
}


