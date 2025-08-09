import java.util.Scanner;
public class A_Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int row = 0, col = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = scan.nextInt();
                if (matrix[i][j] == 1) {
                    row = i;
                    col = j;
                }
            }
        }
        int mov = Math.abs(row - 2) + Math.abs(col - 2);
        System.out.println(mov);
    }
}