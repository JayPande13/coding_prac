package afternewgenprac.DSA.Array.TwoD;

public class TransposeSquareMatrix {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();
        transpose(a);

        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }

    public static int[][] transpose(int[][] a) {
        int row = a.length;;
        int col = a[0].length;
        for(int i=0; i<row;i++){
            for(int j=i; j<col;j++){
                a[j][i] = a[i][j];
            }
        }
        return a;
    }
}
