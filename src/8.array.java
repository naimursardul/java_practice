// An array needs to be declared, just like a variable, with the type of the items it will hold.

class array {
    public static void main(String[ ] args) {

    // To declare an array, you need to define the type of the elements with square brackets.
    int[ ] ages;
    // The name of the array is ages. The type of elements it will hold is int.


    
    // Now, to create the array, we need to specify the number of items it will hold using the new keyword:

    ages = new int[5];
    // The code above creates an array of 5 integers.

    // We can combine the above code into one line:
    int[] allAges = new int[5];


    
    // The items in an array are accessed using their position, also called their index. Here is an example, setting the item with the index 2 to the value 25:
    ages[2] = 25;
    // The item with index 2 is actually the 3rd item of the array. That's because array indexes start from 0, meaning that the first element's index is 0 rather than one. So, the maximum index of the array int[5] is 4.
        


    // If you already know what values to store in the array, instead of assigning them one by one, you can use the following syntax:
        String[ ] names = { "A", "B", "C", "D"};
        System.out.println(names[2]);



    }
}
