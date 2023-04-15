package class10;

public class E5D2Arrays {
    public static void main(String[] args) {
        int[][]matrix={
                {10,20,30,40,50}, // index is 4; element is length which is 5
                {20,50,65,20},
                {102,54,60},
                {20,55}
        };
        for(int row=0; row< matrix.length; row++){
        // matrix[i] will return the complete 1D array at the index specified by the value i
            for(int column=0; column<matrix[row].length; column++){ // int[] arr=matrix[i] --> matrix[i].length
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }
    }
}
