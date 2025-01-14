package afternewgenprac.DSA.Array.TwoD;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr2 = {{2,2,2}, {3,3,3}, {4,4,4}};
        multiply(arr1, arr2);

    }

    public static void multiply(int[][] arr1, int[][] arr2) {
        if(arr1[0].length != arr2.length){
            System.out.println("This is not a collect multiplication");
            return;
        }
        int[][] result = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                for(int k =0; k < arr1[i].length; k++){
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        for (int[] ints : result) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
