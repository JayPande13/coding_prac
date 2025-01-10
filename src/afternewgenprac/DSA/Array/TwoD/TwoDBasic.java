package afternewgenprac.DSA.Array.TwoD;

import java.util.Scanner;

public class TwoDBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][m];
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                array[i][j]= sc.nextInt();
            }
        }

        for(int i=0; i<array.length;i++){
            for(int j=0; j<array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
