class loops {
    
    public static void main(String[ ] args) {

        // while
        int y = 5;
        while(y < 5) {
            System.out.println("y: " + y); // code won't run.

            y++;
        }


        // do while
        int x = 5;
        do {
            System.out.println("x: " + x); // Even with false condition, code will run once.

            x++;
        } while(x < 5);
        // For do while loop the condition appears at the end of the loop, so the statements in the loop execute once before it is tested. Even with a false condition, the code will run once.


        for(int z=1; z<5; z++) {
            System.out.println(z);
        }
        // for loop has 3 components:
        // for(init; condition; increment) {}
        // The first part runs once when we enter the loop and initializes the variable.
        // The second part is the condition of the loop.
        // The third part runs every time the loop runs.
    }
}


// while VS do while
// The difference between while and do-while is that do-while is guaranteed to run at least once, even with a false condition. Try changing the condition in the code above and see the result.


// Remember the break statement from the switch. It can also be used to terminate loops.

// Another control statement is continue. It makes the loop skip the current iteration and go to the next one.
