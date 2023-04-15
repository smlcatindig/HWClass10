package class10;

public class HW5 {
    public static void main(String[] args) {
        /* Create a 2D array or integer type where you will store
        odd and even numbers in 3 rows and 4 columns.
        Develop a program which will identify/print the even numbers only.
         */

        int[][]arr={
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 7, 6, 5}

        };
        for(int row=0; row< arr.length; row++){
            for(int columns=0; columns<arr[row].length; columns++){
                if(arr[row][columns]%2!=0){
                    System.out.print(arr[row][columns]+" ");
                }
            }
        }
    }

}
