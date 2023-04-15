package class10;

public class HW4 {
    public static void main(String[] args) {
        /* Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
        Print the sum of all numbers.
         */

        int[][]arr={
                {2, 2, 2},
                {5, 5, 5},
                {4, 4, 4}
        };

       for(int row=0; row< arr.length; row++){
           for(int columns=0; columns<arr[row].length; columns++){
               System.out.print(arr[row][columns]+" ");
           }
           System.out.println();
        }
    }
}
