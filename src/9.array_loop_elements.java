class array_loop_elements {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 7};
        
        // for-each loop, to loop over arrays, making the code shorter and easier to read.
        for (int x: nums) {
            System.out.println(x);
        }
        // The loop creates a variable, which automatically is assigned to each value of the array during the loop. You can call the variable anything you want: we called it x in our example.
        // Notice the colon after the variable - it reads as "for each x in nums".
        
    }
}



