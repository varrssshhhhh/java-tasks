
import java.util.*;

public class MatrixLayerRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {
            List<Integer> values = new ArrayList<>();

            int top = layer;
            int bottom = m - 1 - layer;
            int left = layer;
            int right = n - 1 - layer;

            for (int j = left; j <= right; j++)
                values.add(matrix[top][j]);

            for (int i = top + 1; i <= bottom; i++)
                values.add(matrix[i][right]);

            for (int j = right - 1; j >= left; j--)
                values.add(matrix[bottom][j]);

            for (int i = bottom - 1; i > top; i--)
                values.add(matrix[i][left]);

            int size = values.size();
            int index = r % size;

            for (int j = left; j <= right; j++) {
                matrix[top][j] = values.get(index);
                index = (index + 1) % size;
            }

            for (int i = top + 1; i <= bottom; i++) {
                matrix[i][right] = values.get(index);
                index = (index + 1) % size;
            }

            for (int j = right - 1; j >= left; j--) {
                matrix[bottom][j] = values.get(index);
                index = (index + 1) % size;
            }

            for (int i = bottom - 1; i > top; i--) {
                matrix[i][left] = values.get(index);
                index = (index + 1) % size;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + (j == n - 1 ? "\n" : " "));
            }
        }

        sc.close();
    }
}

