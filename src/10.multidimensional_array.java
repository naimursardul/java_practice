class multidimensional_array {
    
public static void main(String[] arg){

    // To create multidimensional arrays, place each array within its own set of square brackets:
    int[ ][ ] sample = { {1, 2, 3}, {4, 5, 6} };
    // Note that the array is created using two square brackets, specifying the two-dimensionality.

    // To access an element in the two-dimensional array, provide two indexes, one for the array, and another for the element inside that array. 
    System.out.println(sample[0][1]);




    
    // The array's two indexes are called row index and column index. Here is how we can visualize it:
        int[][] sample2 = { 
         {1, 2, 3}, 
         {4, 5, 6}, 
        }; 
        int x = sample2[1][0];
        System.out.println(x);
        System.out.println(sample2.length);
    // Each row is an item, which is an array. So, to access a value, we provide the row index, then the column index.


    // Looping multi-dimensional array
    for(int a = 0; a < sample2.length; a++){
        for(int b = 0; b < sample2[a].length; b++){
            System.out.println(sample2[a][b]);
        }
    }



    } 
}
