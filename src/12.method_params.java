class method_params {
// Methods can have parameters that can be used in their code. Parameters are defined in parentheses and can act as variables in a method. For example, let's add a String parameter called name to our welcome() function:

static void welcome(String name) {
  System.out.println("Welcome, " + name);
}
// The above method takes a String called name as its parameter, which is used in the method.

// Methods can take multiple parameters. For that, we simply need to separate them using commas, for example: static void welcome(String name, int age) {}


    public static void main(String[] args){
        // calling method with passing a parameter. The values passed as parameters are called arguments.
        welcome("Naimur");
    }
}
