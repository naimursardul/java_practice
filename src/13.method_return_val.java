// The methods we have seen so far output their result. In some cases we do not need to output the result, but need to assign it to a variable, to work with it in our program. In these cases, we need our method to <b>return </b>the result value.


class method_return_val {
    
// Here is example, specifying the return type to be a <b>double</b>:
    static double perc(double num, int percentage) {
        double res = num*percentage/100;
        return res; // The <b>return </b>keyword stops the method from executing. If there are any statements after <b>return</b>, they won't run.
      }


      public static void main(String[] args){
        double x = perc(500, 50);

        System.out.println(x);
      }

}
