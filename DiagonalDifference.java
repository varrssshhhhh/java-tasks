
import java.util.*;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size();

        int leftDiagonal = 0;
        int rightDiagonal = 0;

        for (int i = 0; i < n; i++) {
            // Left-to-right diagonal
            leftDiagonal += arr.get(i).get(i);

            // Right-to-left diagonal
            rightDiagonal += arr.get(i).get(n - 1 - i);
        }

        return Math.abs(leftDiagonal - rightDiagonal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                row.add(sc.nextInt());
            }

            arr.add(row);
        }

        System.out.println(diagonalDifference(arr));

        sc.close();
    }
}
**Time:** `O(n)`
**Space:** `O(n²)` for storing the matrix.
