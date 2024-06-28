class types {
    public static void main(String[] arg){
        int age = 23; // Integers
        char letter = 'B'; // The char type is used to hold a single character. It is created similar to Strings, however it uses single quotes for the value.
        boolean isOpen = true; // can hold only the values true or false.
        double avg = 10.44; // Decimals
        float mean = 10.23f; //  another type for decimals called float. When using the float type, you need to use an f postfix after the value.

        System.out.println(age);
        System.out.println(letter);
        System.out.println(isOpen);
        System.out.println(avg);
        System.out.println(mean);
    }
}

// float vs double

// By default, decimal values are of type double. float is using less storage in the memory, but is not as precise as the double type. This means that the calculations that use floats are faster than the ones that use double,however, the result is less accurate in terms of the decimal digits.
// As a general rule: use float instead of double when memory usage is critical. If you need more precise computations, for example, when dealing with currency, use double.



//  - int holds integers (whole numbers).
//  - double holds decimal numbers.
//  - float is similar to double, but has less precision and requires less memory.
//  - You need to use an f postfix after the value to make it a float (for example: 3.14f)
//  - char holds a single character.
//  - boolean can have one of the following values: true or false.

