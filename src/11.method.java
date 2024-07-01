// A method is a block of code designed to perform a particular task. For example, our app can have methods like login(), logout(), convert(), etc. The println() that we use for output is also a method.

// The purpose of a method is to create it once and call it multiple times when needed to perform particular tasks.


class method {
// You can define your own methods to perform your desired tasks. Here is an example:
static void welcome() { 
    System.out.println("Welcome");
    System.out.println("I am a method");
    System.out.println("End of method");
}
// The code above declares a method called welcome, which prints 3 lines of text.
// Note that the name of the method is followed by parentheses (). The statements of the method are inside curly braces.

// static is needed to be able to use the method in main. You will learn about the static keyword in more advanced lessons.
// void means that this method does not have a return value. You will learn more about return values later in this module.
// welcome is the name of the method.
    

    public static void main(String[] args){
        // calling the method
        welcome();
    }

}
