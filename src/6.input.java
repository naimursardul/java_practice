// Some programs need user input. There are a number of ways to take input in Java.


import java.util.Scanner; // To take input from the user, we first must import the corresponding class. This line should be written at the very top of your code, before the class declaration.

class inputPrac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // After importing the Scanner class, we need to create a Scanner object. You can use the same Scanner to take multiple inputs.
        
        String name = sc.nextLine(); // nextLine() to take string input
        int age = sc.nextInt(); // nextInt() to take string input
        System.out.println(name+": "+age);
        
    }
}
// Note, that when you run it in our Playground, you need to provide all the inputs in the popup, separated by new lines.

// There are similar methods available to take other types as input: nextDouble(), nextFloat(), nextBoolean().
    
